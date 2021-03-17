package com.demo.store.frameworks.supports;

import com.github.javafaker.Faker;

public class Fakers {

    private Faker faker = new Faker();
    private String endereco, cep,
    telefone, email,
    numeroCartao, cvc;
    String nomeCompleto = faker.name().fullName();

    public Fakers(){

    }

    public String getEndereco(){
        endereco = faker.address().streetAddress();
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
        email = faker.internet().emailAddress();
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
