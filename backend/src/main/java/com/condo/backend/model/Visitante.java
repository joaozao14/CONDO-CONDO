package com.condo.backend.model;

import java.util.Date;

    public class Visitante {

        // ATRIBUTOS DO OBJETO

        private String nome;
        private String documento;
        private Apartamento apartamento;
        private Date dataHora;

        // CONSTRUTOR

        public Visitante(String nome, String documento, Apartamento apartamento, Date dataHora) {

            this.nome = nome;
            this.documento = documento;
            this.apartamento = apartamento;
            this.dataHora = dataHora;

        }

        // GETTERS

        public String getNome() {
            return nome;
        }

        public String getDocumento() {
            return documento;

        }

        public Apartamento getApartamento() {
            return apartamento;
        }

        public Date getDataHora() {
            return dataHora;
        }

        // SETTERS

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public void setApartamento(Apartamento apartamento) {
            this.apartamento = apartamento;
        }

        public void setDataHora(Date dataHora) {
            this.dataHora = dataHora;
        }

    }