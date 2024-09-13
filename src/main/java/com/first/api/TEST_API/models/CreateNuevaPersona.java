package com.first.api.TEST_API.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateNuevaPersona {


    public String getNombre() {
        return Nombre;
    }
    public Integer getEdad() {
        return Edad;
    }

    @JsonProperty("nombre")
    String Nombre;
    @JsonProperty("edad")
    Integer Edad;


}
