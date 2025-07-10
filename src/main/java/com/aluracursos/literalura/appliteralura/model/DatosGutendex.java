package com.aluracursos.literalura.appliteralura.model;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosGutendex(
    @JsonAlias("count") Integer numLibros,
    @JsonAlias("results") ArrayList<DatosLibro> libros) {
}
