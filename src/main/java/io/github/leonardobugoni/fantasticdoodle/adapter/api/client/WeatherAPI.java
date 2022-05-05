package io.github.leonardobugoni.fantasticdoodle.adapter.api.client;

import io.github.leonardobugoni.fantasticdoodle.domain.Forecast;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "wheater", url = "${weather.api.url}")
public interface WeatherAPI {

    @GetMapping("data/2.5/weather?lat={latitude}&lon={longitude}&units=metric&lang=pt_br&appid=6412c2c836cdd3ab0017703d5d1f094b")
    Forecast getForecast(@PathVariable("latitude") final String latitude, @PathVariable("longitude") final String longitude);
}
