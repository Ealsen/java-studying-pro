package com.example.firstspbotstd.controller;

import com.example.firstspbotstd.entity.User;

import org.springframework.web.bind.annotation.*;

@RestController
public class ParamsController {
    // http://localhost:8999/params02?name=zhangsan
    // http://localhost:8999/params0?name=zhangsan&age=18
    @RequestMapping(value = "/params0",method = RequestMethod.GET)
    public String params(String name,String age){
        return "name:"+name+" age:"+age;
    }

    // http://localhost:8999/params1?age=21
    // http://localhost:8999/params1?name=zhangsan&age=19
    @RequestMapping(value = "/params1",method = RequestMethod.POST)
    public String params1(String name,String age){
        return "name:"+name+" age:"+age;
    }

    // http://localhost:8999/params2  // 400
    // http://localhost:8999/params2?name=zhangsan&age=21
    @RequestMapping(value = "/params2",method = RequestMethod.GET)
    // required = false 表示参数可以为空 value = "name"
    public String params2(@RequestParam(value = "name",required = true) String name, String age){
        return "name:"+name+" age:"+age;
    }

    // http://localhost:8999/postTest1
    @RequestMapping(value = "/postTest1", method = RequestMethod.POST)
    public String postTest1(){
            return "POST1";
    }

    // http://localhost:8999/postTest2?username=zhangsan&password=123456
    @RequestMapping(value = "/postTest2", method = RequestMethod.POST)
    public String postTest2(String username, String password){
        System.out.println("username:"+username+"\n"+"password:"+ password);
        return "POST2";
    }


    // 通配符请求
    // http://localhost:8999/test/test1/test2/test3
    // http://localhost:8999/test/test1/test2/test3/test4
    @GetMapping("/test/**")
    public String test(){
        return "通配符请求";
    }

    // http://localhost:8999/params?username=zhangsan&password=123456
    @RequestMapping(value = "/params", method = RequestMethod.POST)
    public String params(User user){
        System.out.println("username:"+user.getUsername()+"\n"+"password:"+ user.getPassword());
        return "POST2";
    }
}
