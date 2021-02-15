package ee.siimp;

import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class HelloWorldController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @Route(methods = HttpMethod.GET, path = "/", produces = MediaType.TEXT_PLAIN)
    void hello(RoutingContext routingContext) {
        // LOG.info("hello action called");
        routingContext.response().end("hello world");
    }
}
