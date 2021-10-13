package br.com.ifpe.atividade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ifpe.atividade.model.Provider;

@Controller
public class ProviderController {
    
    @GetMapping("/provider_register")
    public String formPageProvider(){
        return "provider-register";
    }

    @PostMapping("/save_provider")
    public String formSaveClient(Provider provider){
        System.out.println("Provider: "+provider.getNome()+" - "+provider.getCnpj()+" - "+provider.getFone());
        return "index";
    }
}
