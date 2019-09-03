package com.etl.grn.controller;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.etl.grn.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author ETLGRN
 * @since 2019-09-03
 */
@RestController
@RequestMapping("/user")
public class RestUserController {
    @GetMapping("/get")
    public Mono<User> get() {
        User user = new User();
        user.setId(1);
        User user1 = user.selectById();
        return Mono.just(user1);
    }

}

