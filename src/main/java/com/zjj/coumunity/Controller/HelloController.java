package com.zjj.coumunity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname HelloController
 * @Description ：
 * @Date 2019/9/9 11:29
 * @Created by ZJJ
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }


}
