/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.utils;

/**
 *
 * @author raymond
 */
public class Untyper {
    public static <T> Object[] untype(T obj[]) {
        Object[] result = new Object[obj.length];
        
        for (int i = 0; i < obj.length; ++i) {
            result[i] = obj[i];
        }
        
        return result;
    }
}
