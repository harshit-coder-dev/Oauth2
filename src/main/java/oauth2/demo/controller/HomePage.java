package oauth2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @GetMapping("/")
    public String home(){
        return "Hello, World";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello, Secured";
    }
}
