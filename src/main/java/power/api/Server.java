/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

/**
 *
 * @author raymond
 */
public class Server extends Verticle {

  public void start() {
    vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
      public void handle(HttpServerRequest req) {
        req.response().headers().set("Content-Type", "text/plain");
        req.response().end("Hello World");
      }
    }).listen(Integer.parseInt(container.env().getOrDefault("PORT", "8080")), "0.0.0.0");
  }
}
