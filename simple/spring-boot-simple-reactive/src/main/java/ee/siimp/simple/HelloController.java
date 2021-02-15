package ee.siimp.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/")
public class HelloController {

    public static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, path = "/")
    public Mono<String> hello() {
        // LOG.info("hello action called");
        return Mono.just("hello world");
    }

}
