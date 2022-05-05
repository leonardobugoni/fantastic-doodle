package io.github.leonardobugoni.fantasticdoodle.adapter.loader;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.leonardobugoni.fantasticdoodle.domain.City;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CitiesLoaderImplementation implements CitiesLoader {

    private final ObjectMapper objectMapper;

    @Value("${cities.filename}")
    private String fileName;

    @Override
    @SneakyThrows
    public List<City> loader() {
        final File file = ResourceUtils.getFile("classpath:".concat(fileName));
        return Arrays.asList(objectMapper.readValue(file, City[].class));
    }
}
