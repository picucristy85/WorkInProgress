package WorkInProgress.WorkingInProgress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello! This is the exercise no. 1!";
    }
}
