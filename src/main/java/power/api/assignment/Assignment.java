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
    
    private final String assignment;
    private String description;
    private final int timeAllowed;
    private final int oldComparedToNew;
    private final String powerType;
    private final Question[] questions;

    private Assignment(String assigment, int timeAllowed, int oldComparedToNew, String powerType, Question[] questions) {
        this.assignment = assigment;
        this.timeAllowed = timeAllowed;
        this.oldComparedToNew = oldComparedToNew;
        this.powerType = powerType;
        this.questions = questions;
    }
    
    public static Assignment create(String assignment, int timeAllowed, int oldComparedToNew, String powerType, Question[] questions) {
        return new Assignment(assignment, timeAllowed, oldComparedToNew, powerType, questions);
    }
    
    public static Assignment create(String assigment, int timeAllowed, int oldComparedToNew, String powerType, String... questions) {
        Question[] qObj = new Question[questions.length];
        for (int i = 0; i < questions.length; ++i) {
            
            String yn = questions[i].substring(0,2);
            String q = questions[i].substring(2);
            if (yn.equals("Y:")) {
                qObj[i] = Question.create(q, true);
            }
            else if (yn.equals("N:")) {
                qObj[i] = Question.create(q, false);
            }
            else {
                qObj[i] = Question.create(questions[i], true);
            }
        }
        
        return create(assigment, timeAllowed, oldComparedToNew, powerType, qObj);
    }
    
    public static Assignment create(String assignment, int timeAllowed, int oldComparedToNew, String powerType) {
        return create(assignment, timeAllowed, oldComparedToNew, powerType, new Question[] {Question.atHomeRequired});
    }
    
    public Assignment withDescription(String description) {
        this.description = description;
        return this;
    }
    
    public Map<Keyword, Object> toMap() {
        return new HashMap<Keyword, Object>() {{
          put(key("assignment"), assignment);
          put(key("description"), description);
          put(key("allowedTime"), timeAllowed);
          put(key("oldComparedToNew"), oldComparedToNew);
          put(key("powerType"), powerType);
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
