package com.ecommerce.products.Controllers;

import com.ecommerce.products.entities.Product;
import com.ecommerce.products.staticResources.MockProducts;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/")
    public String home() {
        return "Homepage";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return MockProducts.getMockProducts();
    }

}
