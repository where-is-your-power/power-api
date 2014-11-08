/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.http.RouteMatcher;
import power.api.assignment.Assignment;
import power.api.assignment.Assignments;
import power.api.assignment.SmallFacts;
import power.api.transit.TJSON;
import power.api.users.UserInfo;
import power.api.users.UserRepository;
import static power.api.utils.Untyper.untype;

/**
 *
 * @author raymond
 */
public class Routes {
    public static RouteMatcher all() {
        RouteMatcher matcher = new RouteMatcher();
        
        matcher.get("/assignment/new/:user", Routes::newAssignment);
        matcher.get("/assignment/success/:user", Routes::successfulAssignment);
        matcher.get("/assignment/fail/:user", Routes::failedAssignment);
        
        matcher.get("/user/:user", Routes::userInfo);
        matcher.get("/smallfact", Routes::smallFact);
        
        matcher.get("/leaderboard/:topn", Routes::leaderboard);
        
        matcher.noMatch(Routes::whoops);
        return matcher;
    }
    
    public static void whoops(HttpServerRequest req) {
        textResponse(req, "whoops");
    }
    
    public static void newAssignment(HttpServerRequest req) {
       Assignment assignment = Assignments.random();
       TJSON.end(req, assignment.toMap());
    }
    
    public static void successfulAssignment(HttpServerRequest req) {
        String user = req.params().get("user");
        UserRepository.increasePoints(user);
        UserInfo info = UserRepository.get(user);
        
        TJSON.end(req, info.toMap());
    }
    
    public static void failedAssignment(HttpServerRequest req) {
        String user = req.params().get("user");
        UserRepository.reset(user);
        UserInfo info = UserRepository.get(user);
        
        TJSON.end(req, info.toMap());
    }
    
    public static void userInfo(HttpServerRequest req) {
        UserInfo info = UserRepository.get(req.params().get("user"));
        TJSON.end(req, info.toMap());
    }
    
    public static void smallFact(HttpServerRequest req) {
        String fact = SmallFacts.random();
        textResponse(req, fact);
    }
    
    public static void leaderboard(HttpServerRequest req) {
        String user = req.params().get("topn");
        int topn = 1;
        try {
            topn = Integer.parseInt(user);
        }
        catch (NumberFormatException ex) {
            //
        }
        
        UserInfo[] leaders = UserRepository.leaders(topn);
        TJSON.end(req, Arrays.stream(leaders).map(l -> l.toMap()).toArray());
    }
    
    public static void textResponse(HttpServerRequest req, String response) {
        req.response().putHeader("Content-Type","text/plain").end(response);
    }
}