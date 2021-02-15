package ee.siimp.simple;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, path = "/")
    public String hello() {
        return "hello world";
    }

}
