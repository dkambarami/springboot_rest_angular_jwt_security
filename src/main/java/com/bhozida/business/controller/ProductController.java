package com.bhozida.business.controller;


import com.bhozida.business.repository.ProductsRepository;
import com.bhozida.business.model.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class ProductController {

    @Autowired
    ProductsRepository productRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public Iterable<Products> product() {
        return productRepository.findAll();
    }
}