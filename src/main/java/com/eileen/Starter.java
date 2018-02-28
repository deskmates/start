package com.eileen;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Starter {

    @RequestMapping("/abcd")
    @ResponseBody
    String home(String yyz) {
        return "bitch" + yyz;
    }

    /*
     * 多吃点
     * */


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Starter.class, args);
    }
}
