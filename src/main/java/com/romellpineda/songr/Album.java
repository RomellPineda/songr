package com.romellpineda.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageUrl;

    @OneToMany(mappedBy = "album")
    public List<Song> songs;

    public Album() {};

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String toString() {
        return String.format("Album Title: %s by %s ", this.title, this.artist);
    }
}
