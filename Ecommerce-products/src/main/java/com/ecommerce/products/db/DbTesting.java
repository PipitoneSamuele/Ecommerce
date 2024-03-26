package com.ecommerce.products.db;

import com.ecommerce.products.entities.Product;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class DbTesting {

    public static void main(String[] args) {

        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase db = mongoClient.getDatabase("ecommerce").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Product> productsCollection = db.getCollection("products", Product.class);

            FindIterable<Product> products = productsCollection.find();
            @SuppressWarnings("rawtypes")
            MongoCursor cursor = products.cursor();
            while(cursor.hasNext()) {
                Product p = (Product) cursor.next();
                System.out.println(p.getAmount() + " " + p.getDescription());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
