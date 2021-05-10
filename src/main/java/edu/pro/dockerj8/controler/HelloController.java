package edu.pro.dockerj8.controler;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    String getHello(){
        return "<h3>---------Hello, Docker fromJava8!-----  </h3>";
    }
}

