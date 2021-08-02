package com.example.sklep.products;

import com.sun.istack.NotNull;


import javax.persistence.*;


    @Entity
    @Table
    public class Products {
        @Id
        @SequenceGenerator(name = "products_sequence", sequenceName = "products_sequence",  allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_sequence")
        private Long id;
        @NotNull
        private String nazwa;
        @NotNull
        private String producent;
        private double cena;

        @Override
        public String toString() {
            return "Products{" +
                    "id=" + id +
                    ", nazwa='" + nazwa + '\'' +
                    ", producent='" + producent + '\'' +
                    ", cena=" + cena +
                    '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNazwa() {
            return nazwa;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public String getProducent() {
            return producent;
        }

        public void setProducent(String producent) {
            this.producent = producent;
        }

        public double getCena() {
            return cena;
        }

        public void setCena(double cena) {
            this.cena = cena;
        }

        public Products(String nazwa, String producent, double cena, Long id) {
            this.nazwa = nazwa;
            this.producent = producent;
            this.cena = cena;
            this.id = id;
        }

        public Products() {
        }
    }


