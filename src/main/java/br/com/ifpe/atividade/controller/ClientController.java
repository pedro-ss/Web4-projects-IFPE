package br.com.ifpe.atividade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ifpe.atividade.model.Cliente;

@Controller
public class ClientController {
    
    @GetMapping("/client_register")
    public String formPageClient(){
        return "client-register";
    }

    @PostMapping("/save_client")
    public String formSaveClient(Cliente cliente){
        System.out.println("Cliente: "+cliente.getNome()+" - "+cliente.getFone()+" - "+cliente.getEmail());
        return "index";
    }
}
