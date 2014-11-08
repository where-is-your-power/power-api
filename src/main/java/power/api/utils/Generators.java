/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.utils;

import com.cognitect.transit.impl.KeywordImpl;
import com.cognitect.transit.Keyword;

/**
 *
 * @author raymond
 */
public class Generators {
    public static Keyword key(String keyword) {
        return new KeywordImpl(keyword);
    }
}
