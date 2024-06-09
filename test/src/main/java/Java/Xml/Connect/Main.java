package Java.Xml.Connect;

import org.apache.commons.lang3.StringUtils;

import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "tohle je část textu";
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[^\\p{ASCII}]", "");
        System.out.println(s);
    }
}