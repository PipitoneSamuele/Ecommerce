package com.ecommerce.products.staticResources;

import com.ecommerce.products.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class MockProducts {

    public static List<Product> getMockProducts() {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Cassa", 44.99, "Cassa per musica", 4.4, "https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png");
        Product product2 = new Product("Palla", 4.99, "Palla da calcio", 4.2, "https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png");
        Product product3 = new Product("Ventilatore", 29.99, "Ventilatore per casa", 3.8, "https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png");
        Product product4 = new Product("Iphone 12", 1200, "Best phone out there", 4.6, "https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png");
        Product product5 = new Product("Samsung s22", 1049.99, "Best phone out there", 4.6, "https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        return products;
    }

}
