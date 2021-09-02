package com.dio.product_catalog.controller;

import com.dio.product_catalog.model.Product;
import com.dio.product_catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);

    }

//   @RequestMapping(method = RequestMethod.GET)
//   Optional<Product> findAll(@RequestBody Product product) {
//      return productRepository.findAll(product);
//    }
//    @GetMapping
//    public String ProductController() {
//        return "Microservice";
//    }

}
