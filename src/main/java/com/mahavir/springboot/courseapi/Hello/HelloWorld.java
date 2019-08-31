package com.mahavir.springboot.courseapi.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //add RestController to add request mapping controller
public class HelloWorld {

    @RequestMapping("/hello") //default is get http request
    public String sayHi() {
        return "Hello! Spring Boot.";
    }

}
