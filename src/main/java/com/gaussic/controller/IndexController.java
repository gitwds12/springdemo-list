package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuds
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("hello");
        return "index";
    }
}
