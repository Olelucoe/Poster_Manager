package ru.netology.poster;

public class Film {
    public int id;
    public String title;
    public String genre;
    public boolean premiereTomorrow;

    public Film(int id, String title, String genre, boolean premiereTomorrow) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }
}
