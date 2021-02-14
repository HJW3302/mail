package com.boot.web.demo.controller;

import com.boot.web.demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
//复合注解（
// @Controller
//@ResponseBody）
@RestController
public class DemoController {

    @RequestMapping(value = "/demo/hello")
    public String hello(){
        return "hello, world";
    }
    //页面访问接口方式
    @RequestMapping(value = "/demo/json")
    public Map<String,Object> json(){
        Map<String, Object> map = new HashMap<>();
        map.put("你好","世界");
        return map;
    }
    //页面传参接受参数
    @RequestMapping(value = "/demo/auto")
    public Map<String,Object> oid(Integer id,int no){
        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("no",no);
        return map;
    }

    //这里传参name为别名，required=true(默认必填)，defaultValue默认值
    @RequestMapping(value = "/demo/aaa")
    public Map<String,Object> oid(@RequestParam(name = "username",required = false,defaultValue = "admin") String account,
                                  @RequestParam(name = "password",required = false,defaultValue = "123") String password){
        Map<String, Object> map = new HashMap<>();
        map.put("account",account);
        map.put("password",password);
        return map;
    }
    //这里对象实现接参，写对应得值会接到对应的值，不写为null
    @RequestMapping(value = "/demo/bean")
    public Map<String,Object> bean(User user){
        Map<String, Object> map = new HashMap<>();
        map.put("account",user.getAccount());
        map.put("password",user.getPassword());
        return map;
    }
}
