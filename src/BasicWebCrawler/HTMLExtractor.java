package BasicWebCrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Collections;

/**
 * This program extracts data from the INTERNSHIP 2020 website
 * Description of company and URL of logo image
 * <p>
 * Created by Nonthakorn Sukprom, 8 February 2020
 */
public class HTMLExtractor {
    public static void main(String[] args) throws IOException {
        Company latestCompany = null;
        Document html = Jsoup.connect("https://theinternship.io/").get();
        String selector = "div#__layout div div";
        Elements layout = html.select("div#__layout div div section.section div.container div.columns.is-multiline");
        for (Element block : layout.select("div.column.is-one-third-desktop.is-half-tablet")) {
            String imgurl = block.select("div.partner div.logo-box a img").attr("src");
            String txt = block.select("div.partner div.box-textbox span.list-company").text();
            latestCompany = new Company(txt, imgurl);
        }
        Collections.sort(Company.partners);
        Collections.reverse(Company.partners);
        for (int i = 0; i < Company.partners.size(); i++) {
            System.out.println(Company.partners.get(i).getImgURL());
        }
    }
}
