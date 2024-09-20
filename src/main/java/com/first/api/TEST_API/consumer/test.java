package com.first.api.TEST_API.consumer;

import com.first.api.TEST_API.dataSource.entity.Persona;
import com.first.api.TEST_API.dataSource.repository.PersonaRepository;
import com.first.api.TEST_API.models.CreateNuevaPersona;
import com.first.api.TEST_API.models.NombreByIdRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class test {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/print")
    public String printHelloWorldFromBrowser() {

        List<Persona> listPersona = personaRepository.findAll();

        System.out.println(listPersona.get(1));

        System.out.println("Hello world");
        return "esto lo estas regrensando del endpoint /print";
    }
    @GetMapping("/printAll")
    public List<Persona> printALL() {

        List<Persona> listPersona = personaRepository.findAll();

        return listPersona;
    }
    @PostMapping("/printNombreByID")
    public String printNombreByID(@RequestBody NombreByIdRequest request) {

        Persona persona = personaRepository.findById(request.getId()).orElse(null);

        if (Objects.isNull(persona)){
            throw new RuntimeException("No se encontro Nombre por el id {}");
        }

        System.out.println(persona);

        System.out.println("Regresando lo del ID");

        return persona.getNombre();
    }
    @PostMapping("/createNuevaPersona")
    public String createNuevaPersona(@RequestBody CreateNuevaPersona request) {

        Persona nuevaPersona = new Persona();

        nuevaPersona.setNombre(request.getNombre());
        nuevaPersona.setEdad(request.getEdad());

        Persona createPersona = personaRepository.save(nuevaPersona);

        return "Se creo nueva persona " + createPersona.getNombre();
    }

    //TODO: Agregar nuevos endpoints y logica para regresar el response esperado

    //TODO: 1. actualizar persona por Id, regresar la persona actualizada, utilizar METODO PUT
    //TODO: 2. Regresar el numero total de personas registradas, utilizar metodo GET
    //TODO: 3. Regresar el numero total de personas con la misma edad GET


}
