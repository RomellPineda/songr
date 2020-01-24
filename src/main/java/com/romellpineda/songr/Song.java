package com.romellpineda.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String title;
    public int length;
    public int trackNumber;

    @ManyToOne
    Album album;

    public Song() {}

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Long getId() {
        return id;
    }

    public String toString() {
        return String.format("Song Title: %s", this.title);
    }

}
