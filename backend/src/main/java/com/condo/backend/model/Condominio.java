package com.condo.backend.model;

public class Condominio {

      // ATRIBUTOS DO OBJETO

      private String nome;
      private String endereco;
      private String cep;

      // CONSTRUTOR

      public Condominio(String nome, String endereco, String cep) {

            this.nome = nome;
            this.endereco = endereco;
            this.cep = cep;

      }

      // GETTERS

      public String getNome() {
            return nome;
      }

      public String getEndereco() {
            return endereco;
      }

      public String getCep() {
            return cep;
      }

      // SETTERS

      public void setNome(String nome) {
            this.nome = nome;
      }

      public void setEndereco(String endereco) {
            this.endereco = endereco;
      }

      public void setCep(String cep) {
            this.cep = cep;
      }

}