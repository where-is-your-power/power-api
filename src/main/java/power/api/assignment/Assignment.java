/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.assignment;

import com.cognitect.transit.Keyword;
import static power.api.utils.Generators.key;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raymond
 */
public class Assignment {
    
    private final String id;
    private final String description;
    private final int timeAllowed;
    private final Question[] questions;

    private Assignment(String id, String description, int timeAllowed, Question[] questions) {
        this.id = id;
        this.description = description;
        this.timeAllowed = timeAllowed;
        this.questions = questions;
    }
    
    public static Assignment create(String id, String description, int timeAllowed, Question[] questions) {
        return new Assignment(id, description, timeAllowed, questions);
    }
    
    public static Assignment create(String id, String description, int timeAllowed) {
        return create(id, description, timeAllowed, new Question[] {Question.areYouHome});
    }
    
    public Map<Keyword, Object> toMap() {
        return new HashMap<Keyword, Object>() {{
          put(key("id"), id);
          put(key("description"), description);
          put(key("allowedTime"), timeAllowed);
          put(key("questions"), questionsMap());
        }};
    }
    
    public Object[] questionsMap() {
        Object[] result = new Object[questions.length];
        
        for (int i = 0; i < questions.length; ++i) {
            result[i] = questions[i].toMap();
        }
        
        return result;
    }
}
