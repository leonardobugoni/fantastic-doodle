package io.github.leonardobugoni.fantasticdoodle.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Forecast {

    private List<Weather> weather;

}
