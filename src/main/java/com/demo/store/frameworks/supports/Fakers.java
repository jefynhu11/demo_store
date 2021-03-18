package com.demo.store.frameworks.supports;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Fakers {

    private Faker faker = new Faker();
    private Faker fakerBr = new Faker(new Locale("pt-BR"));
    private String cidade, estado, endereco, cep,
    telefone, email,
    numeroCartao, cvc;
    String nomeCompleto = fakerBr.name().fullName();

    public Fakers(){

    }

    public String getCidade(){
        cidade = fakerBr.address().cityName();
        return cidade;
    }

    public String getEstado(){
        estado = fakerBr.address().state();
        return estado;
    }

    public String getEndereco(){
        endereco = fakerBr.address().streetAddress();
        return endereco;
    }
    public String getCep(){
        cep = faker.number().digits(5);
        return cep;
    }
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public String getTelefone(){
        telefone = faker.number().digits(12);
        return telefone;
    }
    public String getEmail(){
        email = fakerBr.internet().emailAddress();
        return email;
    }
    public String getNumeroCartao(){
        numeroCartao = faker.number().digits(16);
        return numeroCartao;
    }
    public String getCvc(){
        cvc = faker.number().digits(3);
        return cvc;
    }
}
