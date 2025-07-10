package com.aluracursos.literalura.appliteralura.service;


import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) throws Exception {
        // TODO Auto-generated method stub
        return objectMapper.readValue(json, clase);
    }

}
