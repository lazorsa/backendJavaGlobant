package com.guide10.exercise;

import com.guide10.service.CountryService;

public class Exercise05_Countries {
    public static void main(String[] args) {
        CountryService countryService = new CountryService();
        countryService.createCountry();
        System.out.println("Lista de países");
        countryService.showCountries();
        System.out.println("Lista de países ordenados por nombre");
        countryService.showCountriesSortedByName();
        System.out.println("Eliminar país");
        countryService.deleteCountry();
        System.out.println("Lista de países");
        countryService.showCountries();
    }
}
