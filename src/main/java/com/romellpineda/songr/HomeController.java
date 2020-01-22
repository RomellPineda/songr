package com.romellpineda.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "home";
    }

    @GetMapping("/capitalize/{str}")
    public String caps(@PathVariable("str") String str, Model m) {
        String word = str.toUpperCase();
        m.addAttribute("word", word);
        return "caps";
    }

    @GetMapping("/albums")
    public String getAlbums(Model m) {
        Album[] albums = new Album[]{
                new Album("Enter The Wu-Tang", "Wu-Tang Clan", 16, 100, "http://example.com/"),
                new Album("Make Yourself", "Incubus", 13, 99, "http://example.com/"),
                new Album("Legend", "Bob Marley", 12, 101, "http://example.com/"),
        };
        m.addAttribute("albums", albums);
        return "albums";
    }
}
