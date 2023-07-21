package com.guide09.exercise.exercise02.service;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }

    public double celsiusToRankine(double celsius) {
        return (celsius + 273.15) * 9 / 5;
    }

    public double rankineToCelsius(double rankine) {
        return (rankine - 491.67) * 5 / 9;
    }

    public double fahrenheitToRankine(double fahrenheit) {
        return fahrenheit + 459.67;
    }

    public double rankineToFahrenheit(double rankine) {
        return rankine - 459.67;
    }

}
