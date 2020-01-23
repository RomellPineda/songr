package com.romellpineda.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlbumRepository aR;

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
        List<Album> albums = aR.findAll();

        m.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums/new")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageUrl, Model m) {
        Album a = new Album(title, artist, songCount, length, imageUrl);
        aR.save(a);

        return new RedirectView("/albums");
    }
}
