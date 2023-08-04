package com.guide10.exercise;

import com.guide10.service.MovieService;

import java.text.ParseException;
import java.util.Scanner;

public class Exercise04_Movies {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        try {
            movieService.createMovies();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Mostrar películas");
            System.out.println("2. Mostrar películas con duración mayor a 1 hora");
            System.out.println("3. Mostrar películas ordenadas por duración (mayor a menor)");
            System.out.println("4. Mostrar películas ordenadas por duración (menor a mayor)");
            System.out.println("5. Mostrar películas ordenadas por título");
            System.out.println("6. Mostrar películas ordenadas por director");
            System.out.println("7. Salir");
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> movieService.showMovies();
                case 2 -> movieService.showMoviesHigherOneHour();
                case 3 -> movieService.orderMoviesByDuration();
                case 4 -> movieService.orderMoviesByDurationAsc();
                case 5 -> movieService.orderMoviesByTitle();
                case 6 -> movieService.orderMoviesByDirector();
                case 7 -> System.exit(0);
                default -> System.out.println("Opción no válida");
            }
        } while (true);

    }
}
