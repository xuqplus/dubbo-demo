package com.github.xuqplus2.dubbodemoconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.xuqplus2.dubbodemoconsumer.DubboDemoConsumerApplicationTests;
import com.github.xuqplus2.service.AService;
import com.github.xuqplus2.vo.Req;
import com.github.xuqplus2.vo.Resp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
public class AControllerTest extends DubboDemoConsumerApplicationTests {

    @Reference
    AService aService;

    @Test
    public void a() {
        String a = aService.a();
        log.info("dubbo rpc返回结果 =>{}", a);
    }

    @Test
    public void b() {
        Resp b = aService.b(100, "hello, 世界.");
        log.info("dubbo rpc返回结果 =>{}", b);
    }

    @Test
    public void c() {
        Req req = new Req();
        req.setId(200);
        req.setName("hahaha");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("0", "0");
        map.put("1", "00");
        map.put("2", "000");
        map.put("3", "0000");
        map.put("4", "00000");
        map.put("5", null);
        req.setMap(map);

        Resp c = aService.c(req);
        log.info("dubbo rpc返回结果 =>{}", c);
    }
}
