package com.condo.backend.model;

public class Apartamento {

        // ATRIBUTOS DO OBJETO

        private int numDeApartamento;
        private Bloco bloco;
        private int numDeAndar;

        // CONSTRUTOR

        public Apartamento(int numDeApartamento, Bloco bloco, int numDeAndar) {

                this.numDeApartamento = numDeApartamento;
                this.bloco = bloco;
                this.numDeAndar = numDeAndar;

        }

        // GETTERS

        public int getNumDeApartamento() {
                return numDeApartamento;
        }

        public Bloco getBloco() {
                return bloco;
        }

        public int getNumDeAndar() {
                return numDeAndar;
        }

        // SETTERS

        public void setNumDeApartamento(int numDeApartamento) {
                this.numDeApartamento = numDeApartamento;
        }

        public void setBloco(Bloco bloco) {
                this.bloco = bloco;
        }

        public void setNumDeAndar(int numDeAndar) {
                this.numDeAndar = numDeAndar;
        }

}