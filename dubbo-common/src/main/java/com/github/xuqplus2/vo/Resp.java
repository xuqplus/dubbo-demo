package com.github.xuqplus2.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class Resp implements Serializable {

    private Integer id;
    private String name;
    private List<String> roles;
    private Map map;
}
