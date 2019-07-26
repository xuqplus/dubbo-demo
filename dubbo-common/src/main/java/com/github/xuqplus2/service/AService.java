package com.github.xuqplus2.service;

import com.github.xuqplus2.vo.Req;
import com.github.xuqplus2.vo.Resp;

public interface AService {

    String a();

    Resp b(Integer id, String name);

    Resp c(Req req);
}
