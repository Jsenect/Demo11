package cn.itcast.controller;

import cn.itcast.demo.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Reference //从注册中心中获取对象
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String username){
        String hello = helloService.sayHello(username);
        return hello;
"22222222222222"

"111111111111111111"
    }

}
