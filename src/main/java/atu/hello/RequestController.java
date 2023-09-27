package atu.hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class RequestController {
    @GetMapping("/details")
    public String rest(@RequestParam String name, int age){
        return "Hello"+ name+ "you are" +age+ "now";
    }
}
