package ru.netology.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Film;
import ru.netology.poster.PosterManager;

public class FilmTest {
    Film film1 = new Film(1, "Bloodshot", "fantastic", false);
    Film film2 = new Film(2, "Forward", "cartoon", false);
    Film film3 = new Film(3, "Hotel Belgrad", "comedy", false);
    Film film4 = new Film(4, "Gentlemen", "action", false);

    @Test
    public void shouldFilmId() {
        PosterManager manager = new PosterManager();

        manager.addPoster(film1);

        int expected = 1;
        int actual = film1.getId();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFilmTitle() {
        PosterManager manager = new PosterManager();

        manager.addPoster(film2);

        String expected = "Forward";
        String actual = film2.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFilmGenre() {
        PosterManager manager = new PosterManager();

        manager.addPoster(film3);

        String expected = "comedy";
        String actual = film3.getGenre();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFilmPremiere() {
        PosterManager manager = new PosterManager();

        manager.addPoster(film4);

        Boolean expected = false;
        Boolean actual = film3.isPremiereTomorrow();

        Assertions.assertEquals(expected, actual);
    }
}
