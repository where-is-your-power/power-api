/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.http.RouteMatcher;
import power.api.assignment.Assignment;
import power.api.assignment.Assignments;
import power.api.transit.TJSON;

/**
 *
 * @author raymond
 */
public class Routes {
    public static RouteMatcher all() {
        RouteMatcher matcher = new RouteMatcher();
        
        matcher.get("/assignment/new/:user", Routes::newAssignment);
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
    
    public static void textResponse(HttpServerRequest req, String response) {
        req.response().putHeader("Content-Type","text/plain").end(response);
    }
}