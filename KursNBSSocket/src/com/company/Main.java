package com.company;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://www.nbs.rs/static/nbs_site/gen/cirilica/30/kurs/IndikativniKurs.htm").get();
            Elements kurs = doc.select("body > table > tbody > tr:nth-child(3) > td:nth-child(1)");
            double kursBroj = Double.parseDouble(kurs.html().replace(",", "."));

            System.out.println("20 EURA PO DANASNJEM KURSU JE: " + kursBroj * 20);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}