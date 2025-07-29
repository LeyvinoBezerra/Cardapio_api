package br.edu.com.ufersa.cardapio_Api.controller;


import br.edu.com.ufersa.cardapio_Api.comida.Comida;
import br.edu.com.ufersa.cardapio_Api.repository.comidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("comida")
public class ComidaController {
    @Autowired
    private comidaRepository comidaRepository;



    @GetMapping
    public List<Comida>listgetAll(){
        List<Comida> comidaList = comidaRepository.findAll();
        return comidaList;

    }
}
