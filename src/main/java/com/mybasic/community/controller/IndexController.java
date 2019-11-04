package com.mybasic.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：Xue Cong
 * @date ：Created in 2019/11/3 23:49
 * @description：hello的控制器类
 * @modified By：
 * @version: 1.0$
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() { return "index"; }
}
