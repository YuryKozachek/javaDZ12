package ru.netology.manager;

public class PosterManager {
    private String[] arrayFilm = new String[0];
    private int limitFilms;

    public PosterManager() {
        this.limitFilms = 10;
    }

    public PosterManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void addNewFilm(String filmName) {
        String[] newArrayFilms = new String[arrayFilm.length + 1];
        for (int i = 0; i < arrayFilm.length; i++) {
            newArrayFilms[i] = arrayFilm[i];
        }
        newArrayFilms[newArrayFilms.length - 1] = filmName;
        arrayFilm = newArrayFilms;
    }

    public String[] findAll() {
        return arrayFilm;
    }

    public String[] findLast() {
        int arrayLength;
        if (arrayFilm.length < limitFilms) {
            arrayLength = arrayFilm.length;
        } else
            arrayLength = limitFilms;
        String[] arrayReverse = new String[arrayLength];
        for (int i = 0; i < arrayReverse.length; i++) {
            arrayReverse[i] = arrayFilm[arrayFilm.length - 1 - i];
        }
        return arrayReverse;
    }
}
