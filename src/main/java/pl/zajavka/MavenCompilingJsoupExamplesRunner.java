package pl.zajavka;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.List;

public class MavenCompilingJsoupExamplesRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(Jsoup.connect("https://app.zajavka.pl").get().title());
//        List.of("");
    }
}
