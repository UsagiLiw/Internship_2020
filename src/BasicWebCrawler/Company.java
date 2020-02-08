package BasicWebCrawler;

import java.util.ArrayList;

public class Company implements Comparable<Company> {

    public static ArrayList<Company> partners = new ArrayList<Company>();
    private String description;
    private String imgURL;
    private int charCount;

    public Company(String text, String img) {
        description = text;
        imgURL = img;
        partners.add(this);
    }

    private void countChar() {
        charCount = description.length();
    }

    public String getDescription() {
        return description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public Integer getCharCount() {
        return charCount;
    }

    @Override
    public int compareTo(Company company) {
        if (getCharCount() == null || company.getCharCount() == null) {
            return 0;
        }
        return getDescription().compareTo(company.getDescription());
    }
}
