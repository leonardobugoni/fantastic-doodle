package io.github.leonardobugoni.fantasticdoodle.application.exception;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(final String city) {
        super(String.format("City [%s] not found, please correct the city name or try another", city));
    }
}
