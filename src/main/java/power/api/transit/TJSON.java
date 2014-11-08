/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.api.transit;

import com.cognitect.transit.TransitFactory;
import com.cognitect.transit.Writer;
import java.io.ByteArrayOutputStream;
import static com.cognitect.transit.TransitFactory.Format;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.http.HttpServerRequest;

/**
 *
 * @author raymond
 */
public class TJSON {
        
    public static <T> byte[] write(T obj) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Writer<T> writer = TransitFactory.writer(Format.JSON, os);
        writer.write(obj);
        
        return os.toByteArray();
    }
    
    public static <T> void end(HttpServerRequest req, T obj) {
        req.response().putHeader("Content-Type", "application/transit+json")
                .end(new Buffer(write(obj)));
    }
}
