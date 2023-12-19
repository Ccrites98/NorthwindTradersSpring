package com.pluralsight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;
public class AppTester {
    public static void main(String[] args) {
        //ProductDao and config stuff
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ProductDao productDao = context.getBean(ProductDao.class);
        Scanner keyboard = new Scanner(System.in);
            //menu
        while (true) {
            System.out.println("Options:");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
        //switches
            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    listProducts(productDao);
                    break;
                case 2:
                    addProduct(keyboard, productDao);
                    break;
                case 0:
                    System.out.println("Done.");
                    System.exit(0);
                default:
                    System.out.println("No.");
            }
        }
    }
    //methods for product listing and adding
    private static void listProducts(ProductDao productDao) {
        System.out.println("All Products:");
        for (Product product : productDao.getAll()) {
            System.out.println(product);
        }
    }
    //add product method
    private static void addProduct(Scanner keyboard, ProductDao productDao) {
        System.out.print("Enter ID: ");
        int productId = keyboard.nextInt();

        System.out.print("Enter product name: ");
        String name = keyboard.next();

        System.out.print("Enter category: ");
        String category = keyboard.next();

        System.out.print("Enter price: ");
        double price = keyboard.nextDouble();

        Product newProduct = new Product(productId, name, category, price);
        productDao.add(newProduct);

        System.out.println("Added.");
    }}