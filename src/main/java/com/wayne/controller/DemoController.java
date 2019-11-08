package com.wayne.controller;

import com.wayne.common.R;
import com.wayne.entity.DemoUser;
import com.wayne.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wayne
 * @Date 2019-09-29
 */
@RestController
@RequestMapping("/demo")
@SuppressWarnings("ALL")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/user")
    public R getUserById(Integer id) {
        return demoService.getUserById(id);
    }

    @PutMapping("/user")
    public R updateUserById(DemoUser user) {
        return demoService.updateUserById(user);
    }

    @PostMapping("/user")
    public R createUser(DemoUser user) {
        return demoService.createUser(user);
    }

    @DeleteMapping("/user")
    public R deleteUserById(Integer id) {
        return demoService.deleteUserById(id);
    }

    @GetMapping("/test")
    public R test(String value) {
        return R.ok(value).put("TEST", "这是测试接口-02");
    }

}
