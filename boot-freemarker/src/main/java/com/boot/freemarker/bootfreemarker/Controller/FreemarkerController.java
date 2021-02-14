package com.boot.freemarker.bootfreemarker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FreemarkerController {
    @GetMapping("/user/{id}")
    public String login(@PathVariable("id") Integer id ){
        System.out.println(id);
        return "index";
    }
}
