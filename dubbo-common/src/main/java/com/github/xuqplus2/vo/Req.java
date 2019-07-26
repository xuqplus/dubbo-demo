package com.github.xuqplus2.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class Req implements Serializable {

    private Integer id;
    private String name;
    private Map<String, String> map;
}
