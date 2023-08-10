package io.frank.frankverse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"", "/login", "/products/**"})
    public String gui() {
        return "forward:/index.html";
    }
}
