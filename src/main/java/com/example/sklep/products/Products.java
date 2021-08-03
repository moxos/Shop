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
        private String name;
        @NotNull
        private String producer;
        private double price;

        public Products(Long id, String name, String producer, double price) {
            this.id = id;
            this.name = name;
            this.producer = producer;
            this.price = price;
        }

        public Products() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Products{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", producer='" + producer + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


