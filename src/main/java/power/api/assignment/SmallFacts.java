/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.assignment;

import java.io.IOException;
import java.util.Random;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author raymond
 */
public class SmallFacts {
    
    private static Random generator = new Random();
    
    public static String random() {
        try {
            int page = generator.nextInt(9) + 1;
            Document doc = Jsoup.connect("https://www.quest.nl/weetjes/"+ page).get();
            Elements facts = doc.select(".list-container .list-item p");
            
            
            int factnum = generator.nextInt(facts.size());
            return facts.get(factnum).text();
            
        } catch (IOException ex) {
            return null;
        }
    }
}
