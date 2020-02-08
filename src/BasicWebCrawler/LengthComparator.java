package BasicWebCrawler;

import java.util.Comparator;

/**
 * Class implemented from Comparator<String>
 * Overriding "compare" method
 * to let the program compare strings length and sort.
 * <p>
 * Created by Nonthakorn Sukrprom, 7 February 2020.
 * Referenced from https://stackoverflow.com/questions/18885656/java-sort-a-list-of-words-by-length-then-by-alphabetical-order
 */
public class LengthComparator implements Comparator<String> {

    /**
     * Overriding method to let the program compare strings length and sort.
     *
     * @param o1 First string
     * @param o2 Second string
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) {
            return o2.length() - o1.length(); //overflow impossible since lengths are non-negative
        }
        return o1.compareTo(o2);
    }
}
