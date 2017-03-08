package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vytlasai on 3/7/2017.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){

        Product product = new Product();
        product.setProductName("Guitar");
        product.setProductCategory("Instrument");
        product.setProductCondition("New");
        product.setProductDescription("Excellent");
        product.setProductManufacturer("Yamaha");
        product.setProductPrice(1111);
        product.setProductStatus("Available");
        product.setUnitInStock(10);

        Product product1 = new Product();
        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductCondition("New");
        product1.setProductDescription("Excellent");
        product1.setProductManufacturer("Yamaha");
        product1.setProductPrice(1111);
        product1.setProductStatus("Available");
        product1.setUnitInStock(10);

        Product product2 = new Product();
        product2.setProductName("Guitar");
        product2.setProductCategory("Instrument");
        product2.setProductCondition("New");
        product2.setProductDescription("Excellent");
        product2.setProductManufacturer("Yamaha");
        product2.setProductPrice(1111);
        product2.setProductStatus("Available");
        product2.setUnitInStock(10);

        productList = new ArrayList<Product>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);

        return productList;
    }

}
