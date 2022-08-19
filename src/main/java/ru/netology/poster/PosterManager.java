package ru.netology.poster;

public class PosterManager {
    private Film[] posters = new Film[0];
    private int limit;

    public PosterManager() {
        limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addPoster(Film film) {
        Film[] tmp = new Film[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = film;
        posters = tmp;
    }

    public Film[] findAll() {
        return posters;
    }

    public Film[] findLast() {
        int resultLength = Math.min(limit, posters.length);

        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }

}
