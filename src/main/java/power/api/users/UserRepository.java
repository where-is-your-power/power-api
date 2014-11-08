/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.users;

import java.util.HashMap;

/**
 *
 * @author raymond
 */
public class UserRepository {
    
    private static HashMap<String, Integer> pointMap = new HashMap<>();
    
    synchronized
    public static UserInfo get(String user) {
        int points = pointMap.getOrDefault(user, 0);
        return UserInfo.create(user, points);
    }
    
    synchronized
    public static void increasePoints(String user) {
        int currentPoints = pointMap.getOrDefault(user, 0);
        pointMap.put(user, currentPoints + 1);
    }
    
    synchronized
    public static void reset(String user) {
        pointMap.put(user, 0);
    }
    
}
