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
    private final boolean requiredAnswer;

    private Question(String question, boolean requiredAnswer) {
        this.question = question;
        this.requiredAnswer = requiredAnswer;
    }
    
    public static Question create(String question, boolean requiredAnswer) { 
        return new Question(question, requiredAnswer);
    }
    
    public Map<Keyword, Object> toMap() {
        return new HashMap<Keyword, Object>() {{
          put(key("question"), question);
          put(key("requiredAnswer"), requiredAnswer);
        }};
    }
    
    public static Question atHomeRequired = create("Ben je thuis?", true);
    
}
