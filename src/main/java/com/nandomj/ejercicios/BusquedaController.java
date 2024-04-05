package com.nandomj.ejercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BusquedaController {
    //localhost:8080/busqueda-usuario/java 2023
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){

        //Logica de Busqueda
        String[] frasesTipicasDeBusqueda = {"java bootcamp", "java curso", "java tutoriales", "java avanzado"};

        String[] resultadoDeLaBusqueda = new  String[10];
        int contador = 0;

        for (String frase : frasesTipicasDeBusqueda){
            if (frase.contains(busqueda)){
                resultadoDeLaBusqueda[contador]= frase;
                contador ++;
            }
        }
        return resultadoDeLaBusqueda;
    }
}
