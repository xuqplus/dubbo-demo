package com.github.xuqplus2.dubbodemoprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.xuqplus2.service.AService;
import com.github.xuqplus2.vo.Req;
import com.github.xuqplus2.vo.Resp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@Component
public class AServiceImpl implements AService {

    @Override
    public String a() {
        log.info("good job a");
        return "ok";
    }

    @Override
    public Resp b(Integer id, String name) {
        log.info("id={}, name={}", id, name);
        Resp resp = new Resp();
        resp.setId(id);
        resp.setName(name);
        List<String> roles = new ArrayList<>();
        roles.add("a");
        roles.add("aa");
        roles.add("aaa");
        roles.add("aaaa");
        roles.add("aaaaa");
        resp.setRoles(roles);
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "b");
        map.put("aa", "bb");
        map.put("aaa", "bbb");
        map.put("aaaa", null);
        map.put("aaaaa", null);
        return resp;
    }

    @Override
    public Resp c(Req req) {
        log.info("req={}", req);
        Resp resp = new Resp();
        resp.setId(req.getId());
        resp.setName(req.getName());
        resp.setMap(req.getMap());
        return resp;
    }
}
