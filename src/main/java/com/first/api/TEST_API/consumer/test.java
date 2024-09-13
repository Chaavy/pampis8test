package com.first.api.TEST_API.consumer;

import com.first.api.TEST_API.dataSource.entity.Persona;
import com.first.api.TEST_API.dataSource.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/print")
    public String printHelloWorldFromBrowser() {

        List<Persona> listPersona = personaRepository.findAll();

        System.out.println(listPersona.get(0));

        System.out.println("Hello world");
        return "esto lo estas regrensando del endpoint /print";
    }

}
