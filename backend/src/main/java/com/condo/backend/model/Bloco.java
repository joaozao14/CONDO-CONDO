package com.condo.backend.model;

public class Bloco {

      // ATRIBUTOS DO OBJETO

      private String nome;
      private int quantidadeDeAndares;

      // CONSTRUTOR

      public Bloco(String nome, int quantidadeDeAndares) {

            this.nome = nome;
            this.quantidadeDeAndares = quantidadeDeAndares;

      }

      // GETTERS

      public String getNome() {
            return nome;
      }

      public int getQuantidadeDeAndares() {
            return quantidadeDeAndares;
      }

      // SETTERS

      public void setNome(String nome) {
            this.nome = nome;
      }

      public void setQuantidadeDeAndares(int quantidadeDeAndares) {
            this.quantidadeDeAndares = quantidadeDeAndares;
      }

}