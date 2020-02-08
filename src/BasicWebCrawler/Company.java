package BasicWebCrawler;

import java.util.ArrayList;

/**
 * Class represents company, Store description and Image URL
 * of the company provided in the website
 * Created by Nonthakorn Sukprom, 8 February 2020
 */
public class Company implements Comparable<Company> {
    /**
     * List of company
     */
    public static ArrayList<Company> partners = new ArrayList<Company>();

    /**
     * Description of the company
     */
    private String description;
    /**
     * URL of image in HTML page
     */
    private String imgURL;
    /**
     * Number of characters in description
     */
    private int charCount;

    /**
     * Constructor method, set description, set image URL
     * add object to list and count character number
     *
     * @param text Company Description
     * @param img  URl of image
     */
    public Company(String text, String img) {
        description = text;
        imgURL = img;
        partners.add(this);
        charCount = description.length();
    }

    /**
     * Getter method, return description
     *
     * @return company description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter method, return imgURL
     *
     * @return URL of image
     */
    public String getImgURL() {
        return imgURL;
    }

    /**
     * Getter method, return charCount
     *
     * @return charCount
     */
    public int getCharCount() {
        return charCount;
    }

    /**
     * Override compareTo method from Comparable<>
     * compare charCount to the charCount of next object
     *
     * @param company next Company object
     * @return -1 if less, 1 if more, 0 if equal
     */
    @Override
    public int compareTo(Company company) {
        if (getCharCount() < company.getCharCount()) {
            return -1;
        } else if (getCharCount() > company.getCharCount()) {
            return 1;
        } else if (getCharCount() == company.getCharCount()) {
            return 0;
        }
        return 0;
    }
}
