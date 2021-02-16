package ee.siimp;

import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class HelloWorldController {

    @Route(methods = HttpMethod.GET, path = "/", produces = MediaType.TEXT_PLAIN)
    void hello(RoutingContext routingContext) {
        routingContext.response().end("hello world");
    }
}
