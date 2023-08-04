package com.guide10.service;

import com.guide10.entity.Movie;

import java.text.ParseException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {
    ArrayList<Movie> movies = new ArrayList<>();
    /**
     * Method to create in bucle a movie and save in ArrayList
     */
    public void createMovies() throws ParseException {
        do {
            System.out.println("Ingrese el título de la película: ");
            String title = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el director de la película: ");
            String director = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la duración de la película: ");
            String time = new Scanner(System.in).nextLine();
            Duration duration;
            try {
                String[] timeComponents = time.split(":");
                int hours = Integer.parseInt(timeComponents[0]);
                int minutes = Integer.parseInt(timeComponents[1]);
                int seconds = Integer.parseInt(timeComponents[2]);

                duration = Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);
            } catch (NumberFormatException e) {
                System.out.println("Formato de duración no válido");
                continue;
            }
            Movie movie = new Movie(title, director, duration);
            movies.add(movie);
            System.out.println("Desea ingresar otra película? (S/N)");
        } while (new Scanner(System.in).nextLine().equalsIgnoreCase("S"));
    }

    /**
     * Method to show all movies
     */
    public void showMovies() {
        System.out.println("Películas ingresadas: ");
        movies.forEach(System.out::println);
    }

    /**
     * Method to show movies with higher 1 hour duration
     */
    public void showMoviesHigherOneHour() {
        System.out.println("Películas con duración mayor a 1 hora: ");
        movies.stream().filter(movie -> movie.getDuration().toHours() > 1).forEach(System.out::println);
    }

    /**
     * Method to order movies by duration (descending) and show
     */
    public void orderMoviesByDuration() {
        System.out.println("Películas ordenadas por duración (mayor a menor): ");
        movies.stream().sorted((movie1, movie2) -> movie2.getDuration().compareTo(movie1.getDuration())).forEach(System.out::println);
    }

    /**
     * Method to order movies by duration (ascending) and show
     */
    public void orderMoviesByDurationAsc() {
        System.out.println("Películas ordenadas por duración (menor a mayor): ");
        movies.stream().sorted((movie1, movie2) -> movie1.getDuration().compareTo(movie2.getDuration())).forEach(System.out::println);
    }

    /**
     * Method to order movies by title (ascending) and show
     */
    public void orderMoviesByTitle() {
        System.out.println("Películas ordenadas por título (A-Z): ");
        movies.stream().sorted((movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle())).forEach(System.out::println);
    }

    /**
     * Method to order movies by director (ascending) and show
     */
    public void orderMoviesByDirector() {
        System.out.println("Películas ordenadas por director (A-Z): ");
        movies.stream().sorted((movie1, movie2) -> movie1.getDirector().compareTo(movie2.getDirector())).forEach(System.out::println);
    }

}
