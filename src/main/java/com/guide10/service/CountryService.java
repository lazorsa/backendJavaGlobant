package com.guide10.service;

import com.guide10.entity.Country;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CountryService {
    HashSet<Country> countries = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void createCountry() {
        do {
            System.out.println("Ingrese el nombre del país");
            String name = scanner.nextLine();
            System.out.println("Ingrese la capital del país");
            String capital = scanner.nextLine();
            System.out.println("Ingrese el continente del país");
            String continent = scanner.nextLine();
            System.out.println("Ingrese el idioma del país");
            String language = scanner.nextLine();
            Country country = new Country(name, capital, continent, language);
            countries.add(country);
            System.out.println("¿Desea agregar otro país? (S/N)");
        } while (scanner.nextLine().equalsIgnoreCase("S"));
    }

    public void showCountries() {
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public void showCountriesSortedByName() {
        countries.stream().sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())).forEach(System.out::println);
    }

    public void deleteCountry(){
        System.out.println("Ingrese el nombre del país");
        String name = scanner.nextLine();
        Iterator<Country> iterator = countries.iterator();
        while (iterator.hasNext()) {
            Country country = iterator.next();
            if (country.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("País eliminado");
            }
        }
        if (findCountry(name)) {
            System.out.println("País no encontrado");
        }
    }

    public boolean findCountry(String name){
        for (Country country : countries) {
            if (country.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

}

