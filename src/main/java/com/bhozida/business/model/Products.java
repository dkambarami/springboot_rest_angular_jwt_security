package com.bhozida.business.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String prodName;
    String prodDesc;
    Double prodPrice;
    String prodImage;

    public Products() {
    }

    public Products(String prodName, String prodDesc, Double prodPrice, String prodImage) {
        super();
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.prodImage = prodImage;
    }


}