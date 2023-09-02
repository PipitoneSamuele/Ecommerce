package com.ecommerce.users.Controllers;

import com.ecommerce.users.entities.User;
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
public class UsersController {

    CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));

    @GetMapping("/")
    public String home() {
        return "Homepage";
    }

    @GetMapping("/users")
    public List<User> getProducts() {
        List<User> products = new ArrayList<>();
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase db = mongoClient.getDatabase("ecommerce").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<User> productsCollection = db.getCollection("users", User.class);

            FindIterable<User> productsIterable = productsCollection.find();
            MongoCursor<User> cursor = productsIterable.cursor();
            while(cursor.hasNext()) {
                User u = (User) cursor.next();
                products.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

}
