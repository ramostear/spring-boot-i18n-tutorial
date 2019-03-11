package com.ramostear.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ramostear
 * @create-time 2019/3/11 0011-18:12
 * @modify by :
 * @since:
 */
@Controller
public class I18NController {

    @GetMapping("/index.html")
    public String index(){
        return "index";
    }
}
