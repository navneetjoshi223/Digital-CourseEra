/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */
public class ProductDirectory {
    private ArrayList<Product> products;

    public ProductDirectory() {
        this.products = new ArrayList<>();
        // Create dummy data
        createDummyData();
    }

    private void createDummyData() {
        // Dummy data for Software products
        products.add(new Product("Software1", "Software", 49.99));
        products.add(new Product("Software2", "Software", 29.99));
        products.add(new Product("Software3", "Software", 19.99));
        products.add(new Product("Software4", "Software", 39.99));
        products.add(new Product("Software5", "Software", 59.99));

        // Dummy data for Lab products
        products.add(new Product("Lab1", "Lab", 199.99));
        products.add(new Product("Lab2", "Lab", 149.99));
        products.add(new Product("Lab3", "Lab", 129.99));
        products.add(new Product("Lab4", "Lab", 179.99));
        products.add(new Product("Lab5", "Lab", 209.99));
    }

    // Getters and setters

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
