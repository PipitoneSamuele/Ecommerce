package com.ecommerce.products.Controllers;

import com.ecommerce.products.entities.Product;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));

    @GetMapping("/")
    public String home() {
        return "Homepage";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase db = mongoClient.getDatabase("ecommerce").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Product> productsCollection = db.getCollection("products", Product.class);

            FindIterable<Product> productsIterable = productsCollection.find();
            MongoCursor<Product> cursor = productsIterable.cursor();
            while(cursor.hasNext()) {
                Product p = (Product) cursor.next();
                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

}
