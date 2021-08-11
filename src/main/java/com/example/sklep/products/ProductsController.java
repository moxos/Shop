package com.example.sklep.products;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;


import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/products")
public class ProductsController {
    private final ProductsRepository productsRepository;



@Autowired
    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

@GetMapping(value="/hoho")
    public void showoOF(){



}




    @GetMapping(value="/name/{p}")
    public Optional<Products> byNamee(@PathVariable("p") String nazwa){
        Optional<Products> a;
        a = productsRepository.findProductsByName(nazwa);
        return a;


    }
    @GetMapping(path="/producent/{p}")
    public List<Products>showProducent(@PathVariable("p")String producent){
        List<Products> producer = productsRepository.findProductsByProducer(producent);

        return  producer;
    }



}
