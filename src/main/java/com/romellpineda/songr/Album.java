package com.romellpineda.songr;

public class Album {
    public String title;
    public String artist;
    public int songCount;
    public int length;

    public Album(String title, String artist, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
    }

    public String toString() {
        return String.format("Album Title: %s by %s ", this.title, this.artist);
    }
}
