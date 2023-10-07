package com.xljdodd.yys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通用入口
 *
 * @author longbing
 * @since 2023/10/7 15:06
 */
@RestController
@RequestMapping(value = "yys")
public class YysController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
