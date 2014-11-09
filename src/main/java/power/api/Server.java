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

    public final static int DEFAULT_PORT = 80;
    public final static String PORT = "PORT";
    
    public void start() {

        int port = DEFAULT_PORT;
        if (container.env().containsKey(PORT) && !container.env().get(PORT).isEmpty()) {
            port = Integer.parseInt(container.env().getOrDefault("PORT", "_"));
        }

        vertx.createHttpServer()
                .requestHandler(Routes.all())
                .listen(port, "0.0.0.0");

        container.logger().info("Webserver started, listening on port: " + port);
    }
}
