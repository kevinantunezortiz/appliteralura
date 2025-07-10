package com.aluracursos.literalura.appliteralura.principal;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aluracursos.literalura.appliteralura.model.DatosGutendex;
import com.aluracursos.literalura.appliteralura.model.DatosLibro;
import com.aluracursos.literalura.appliteralura.service.ConsumoAPI;
import com.aluracursos.literalura.appliteralura.service.ConvierteDatos;



public class Principal {
    private static final String URL_API = "https://gutendex.com/books?search=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();    
    private Scanner teclado = new Scanner(System.in); 
    public void mostrarMenú() throws Exception{
        System.out.println("Bienvenido a Literalura");
        System.out.println("Ingrese el nombre del libro que desea buscar: ");
        String titulo = teclado.nextLine();
        String json = consumoAPI.obtenerDatos(URL_API+titulo.replace(" ","%20" ));
        //System.out.println(json);
        DatosGutendex datosGutendex = convierteDatos.obtenerDatos(json,DatosGutendex.class);
        var libros = datosGutendex.libros();
        var milibro = libros.get(0);
        
    }

}
