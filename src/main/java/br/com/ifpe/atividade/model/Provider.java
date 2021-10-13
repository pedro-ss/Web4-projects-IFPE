package br.com.ifpe.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Provider {

    private String nome;
    private String cnpj;
    private String fone;
}
