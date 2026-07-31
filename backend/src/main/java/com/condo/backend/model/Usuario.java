package com.condo.backend.model;

public class Usuario {

   // ATRIBUTOS DO OBJETO

   private String nome;
   private String email;
   private String senha;
   private TipoUsuario tipoUsuario; // Cada usuário possui um tipo de usuário (Morador, Porteiro, Síndico ou Administrador)
   private Apartamento apartamento;

//<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

   // CONSTRUTOR

   public Usuario(String nome, String email, String senha, TipoUsuario tipoUsuario, Apartamento apartamento) {

      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.tipoUsuario = tipoUsuario;
      this.apartamento = apartamento;

   }

//<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

   // GETTERS

   public String getNome() {
      return nome;
   }

   public String getEmail() {
      return email;
   }

   public String getSenha() {
      return senha;
   }

   public TipoUsuario getTipoUsuario() {
      return tipoUsuario;
   }

   public Apartamento getApartamento () {
      return apartamento;
   }


  //<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>

   // SETTERS

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public void setTipoUsuario(TipoUsuario tipoUsuario) {
      this.tipoUsuario = tipoUsuario;
   }

   public void setApartamento(Apartamento apartamento) {
      this.apartamento = apartamento;
   }


}
