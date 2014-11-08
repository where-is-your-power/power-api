/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.assignment;

import com.cognitect.transit.Keyword;
import static power.api.utils.Generators.key;
import static power.api.utils.Untyper.untype;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raymond
 */
public class Question {
    
    private final String question;
    private final String[] possibleAnswers;
    private final String requiredAnswer;

    private Question(String question, String[] possibleAnswers, String requiredAnswer) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.requiredAnswer = requiredAnswer;
    }
    
    public static Question create(String question, String[] possibleAnswers, String requiredAnswer) { 
        return new Question(question, possibleAnswers, requiredAnswer);
    }
    
    public Map<Keyword, Object> toMap() {
        return new HashMap<Keyword, Object>() {{
          put(key("question"), question);
          put(key("possibleAnswers"), untype(possibleAnswers));
          put(key("requiredAnswer"), requiredAnswer);
        }};
    }
    
    public static Question areYouHome = create("Ben je thuis?", new String[] {"Ja", "Nee"}, "Ja");
    
}
