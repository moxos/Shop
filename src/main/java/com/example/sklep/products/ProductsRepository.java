package com.example.sklep.products;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    Optional<Products>findProductsByCena(Double cena);

    Optional<Products>findProductsByNazwa(String nazwa);

    List<Products>findProductsByProducent(String producent);

    void deleteById(Long id);




}
