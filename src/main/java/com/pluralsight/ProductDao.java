package com.pluralsight;
import java.util.List;
//ProductDAO. tbh I don't know what else to notate here
//honestly I really like Spring.
public interface ProductDao {
    void add(Product product);
    List<Product> getAll();
}