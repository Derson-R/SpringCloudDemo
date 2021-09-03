package com.controller;

import com.domain.Order;
import com.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @RequestMapping("/user/{uid}")
    public User getOrder(@PathVariable("uid") Integer uid){
        log.info("用户信息查询查询开始");
        User user = new User(1,"张三","123","18955699999");
        log.info("用户信息查询结束");
        return user;

    }
}
