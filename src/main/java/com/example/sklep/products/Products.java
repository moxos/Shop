package com.example.sklep.products;




import javax.persistence.*;

import java.util.Objects;


@Entity
@Table(name="products")
    public class Products {
        @Id

        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;

        private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(id, products.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


