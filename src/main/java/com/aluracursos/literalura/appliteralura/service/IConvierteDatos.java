package com.aluracursos.literalura.appliteralura.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase) throws Exception;
    
}
