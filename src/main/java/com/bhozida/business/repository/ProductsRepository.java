package com.bhozida.business.repository;

import com.bhozida.business.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface  ProductsRepository extends JpaRepository<Products,Long>{
    @Override
    void delete(Products deleted);
    
}