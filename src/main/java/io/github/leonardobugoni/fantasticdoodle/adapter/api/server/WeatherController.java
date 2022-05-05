package io.github.leonardobugoni.fantasticdoodle.adapter.api.server;


import io.github.leonardobugoni.fantasticdoodle.adapter.api.client.WeatherAPI;
import io.github.leonardobugoni.fantasticdoodle.adapter.loader.CitiesLoader;
import io.github.leonardobugoni.fantasticdoodle.application.exception.CityNotFoundException;
import io.github.leonardobugoni.fantasticdoodle.domain.City;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherAPI weatherAPI;
    private final CitiesLoader citiesLoader;

    @GetMapping(value = "/forecast")
    public String getForecastByCity(@RequestParam("city") final String cityName){
        // TODO Loader and filter cities, get forecast... Where is the single responsibility?

        final List<City> cities = citiesLoader.loader();

        final Optional<City> cityOptional = cities.stream().filter(c -> c.getNome().equals(cityName)).findFirst();

        if (cityOptional.isPresent()) {
            final City city = cityOptional.get();
            return weatherAPI.getForecast(city.getLatitude(), city.getLongitude()).getWeather().stream().findFirst().get().getDescription();
        } else {
            throw new CityNotFoundException(cityName);
        }

    }
}
