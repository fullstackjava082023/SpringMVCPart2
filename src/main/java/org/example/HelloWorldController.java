package org.example;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/myapp", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String helloWorld() {
        return "Hello World2";
    }
}