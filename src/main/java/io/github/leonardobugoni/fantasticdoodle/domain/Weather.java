package io.github.leonardobugoni.fantasticdoodle.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Weather {

    private String id;
    private String main;
    private String description;
    private String icon;
}
