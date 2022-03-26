package com.lirong.redis_springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    // 测试提交；
    @GetMapping
    public String testRedis(){
        redisTemplate.opsForValue().set("name","lucy");
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println("laldas");
        System.out.println("laldas");
        System.out.println("laldas - hot-fix");
        System.out.println("main ");
        return name;
    }
}
