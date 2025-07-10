package com.aluracursos.literalura.appliteralura.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
    @JsonAlias("id") Integer id,
    @JsonAlias("title") String titulo,
    @JsonAlias("download_count") Integer descargas,
    @JsonAlias("authors") ArrayList<DatosAutor> autores,
    @JsonAlias("languages") ArrayList<String> idiomas) {
}