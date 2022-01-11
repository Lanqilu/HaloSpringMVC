package com.halo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2021/7/7
 * Author:ybc
 * Description:
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
