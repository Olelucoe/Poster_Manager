package ru.netology.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Film;
import ru.netology.poster.PosterManager;

public class PosterManagerTest {

    Film film1 = new Film(1, "Bloodshot", "fantastic", false);
    Film film2 = new Film(2, "Forward", "cartoon", false);
    Film film3 = new Film(3, "Hotel Belgrad", "comedy", false);
    Film film4 = new Film(4, "Gentlemen", "action", false);

    @Test

    public void shouldAddPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);

        Film[] expected = {film1, film2, film3, film4};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindLastPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);

        Film[] expected = {film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastPosterLimit() {
        PosterManager manager = new PosterManager(10);

        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);

        Film[] expected = {film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastPosterLessLimit() {
        PosterManager manager = new PosterManager(3);

        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);

        Film[] expected = {film4, film3, film2};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
