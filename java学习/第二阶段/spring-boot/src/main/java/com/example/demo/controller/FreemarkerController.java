package com.example.demo.controller;

import com.example.demo.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {
    @Autowired
    private ServerSettings setting;
    @GetMapping("hello")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("setting",setting);
        return "fm/index";
    }


}
