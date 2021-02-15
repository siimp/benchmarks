package simple;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller("/")
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Get(produces = MediaType.TEXT_PLAIN)
    public Single<String> hello() {
        // LOG.info("hello action called");
        return Single.just("hello world");
    }
}
