package com.example.sklep.products;

import com.example.sklep.exception.UserNotFoundExceotion;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/shop")
public class ProductsController {
    private final ProductsRepository productsRepository;



    @Autowired
    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }


   @GetMapping(path ="/all")
   public void showProducts(Long Id){




   }
   @GetMapping(path = "/to/{aha}")
    public Products byCena(@PathVariable("aha")Double cena){

        return productsRepository.findProductsByCena(cena)
                .orElseThrow(()->new UserNotFoundExceotion("Product by cena"+ cena+" was not fiund"));

    }
    @GetMapping(value="/name/{p}")
    public Optional<Products> byNamee(@PathVariable("p") String nazwa){
        Optional<Products> a;
        a = productsRepository.findProductsByNazwa(nazwa);
        return a;


    }
    @GetMapping(path="/producent/{p}")
    public List<Products>showProducent(@PathVariable("p")String producent){
        List<Products> producents = productsRepository.findProductsByProducent(producent);

        return  producents;
    }

    @DeleteMapping  ("/delete/{id}")
    public void deleteProduct(@PathVariable("id") long id){
        productsRepository.deleteById(id);


    }

}
