package com.example.sklep.products;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    Optional<Products>findProductsByPrice(Double cena);

    Optional<Products>findProductsByName(String nazwa);

    List<Products>findProductsByProducer(String producent);

    Optional<Products>deleteById(long id);






}
