package io.github.leonardobugoni.fantasticdoodle.domain;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class City {

    private String codigo_ibge;
    private String nome;
    private String latitude;
    private String longitude;
    private String capital;
    private String codigo_uf;
    private String siafi_id;
    private String ddd;
    private String fuso_horario;

}
