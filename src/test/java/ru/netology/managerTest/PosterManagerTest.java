package ru.netology.managerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.PosterManager;

public class PosterManagerTest {

    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";
    String movie6 = "movie6";
    String movie7 = "movie7";
    String movie8 = "movie8";
    String movie9 = "movie9";
    String movie10 = "movie10";


    @Test
    public void addNewMovie() {

        PosterManager manager = new PosterManager();

        manager.addNewFilm(movie1);
        manager.addNewFilm(movie2);
        manager.addNewFilm(movie3);


        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMovie(){
        PosterManager manager = new PosterManager();

        manager.addNewFilm(movie1);
        manager.addNewFilm(movie2);
        manager.addNewFilm(movie3);
        manager.addNewFilm(movie4);
        manager.addNewFilm(movie5);
        manager.addNewFilm(movie6);
        manager.addNewFilm(movie7);
        manager.addNewFilm(movie8);
        manager.addNewFilm(movie9);
        manager.addNewFilm(movie10);

        String[] expected = manager.findAll();
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovie() {

        PosterManager manager = new PosterManager(5);

        manager.addNewFilm(movie1);
        manager.addNewFilm(movie2);
        manager.addNewFilm(movie3);
        manager.addNewFilm(movie4);
        manager.addNewFilm(movie5);
        manager.addNewFilm(movie6);
        manager.addNewFilm(movie7);
        manager.addNewFilm(movie8);
        manager.addNewFilm(movie9);
        manager.addNewFilm(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieLessLimit(){
        PosterManager manager = new PosterManager(5);


        manager.addNewFilm(movie8);
        manager.addNewFilm(movie9);
        manager.addNewFilm(movie10);

        String[] expected = {movie10, movie9, movie8};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
