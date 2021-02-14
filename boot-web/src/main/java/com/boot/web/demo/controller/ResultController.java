package com.boot.web.demo.controller;

import com.boot.web.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResultController {
    //Result风格 需要加注解@PathVariable  select

    //@RequestMapping(value = "/user/{pid}", method = RequestMethod.GET)
    @GetMapping(value = "/user/{pid}")
    public void selPid(@PathVariable  int pid){
        System.out.println("执行了查询 pid ="+pid);
    }

    // 查询所有用信息
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public void getUser() {
        System.out.println("查询到所有信息");
    }

    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    public void add(User user){
        System.out.println("执行了添加操作user ="+user);
    }

    @RequestMapping(value = "/user/{pid}" ,method = RequestMethod.DELETE)
    public void del(@PathVariable int pid) {
        System.out.println("执行了删除操作 id"+pid);
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public void upd(User user){
        System.out.println("执行了修改操作 user"+user);
    }
}
