/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.users;

import com.cognitect.transit.Keyword;
import java.util.HashMap;
import java.util.Map;
import static power.api.utils.Generators.key;

/**
 *
 * @author raymond
 */
public class UserInfo {
    private final String name;
    private final int points;

    private UserInfo(String name, int points) {
        this.name = name;
        this.points = points;
    }
    
    public static UserInfo create(String name, int points) {
        return new UserInfo(name, points);
    }
    
    public Map<Keyword, Object> toMap() {
        return new HashMap<Keyword, Object>() {{
            put(key("name"), name);
            put(key("points"), points);
        }};
    }
}
