package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Vytlasai on 3/7/2017.
 */
@Controller
public class HomeController {
    private ProductDao productDao = new ProductDao();


    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model){

        List<Product> products = productDao.getProductList();
        model.addAttribute("products",products);
        return "/productList";


    }

}

