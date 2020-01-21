package com.romellpineda.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getName(String str, Model m) {
        m.addAttribute("username", "roml");
        return "home";
    }

}
