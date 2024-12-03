package com.faang;

import com.faang.disassemblingAnAmazonWarehouse.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static HashSet<Product> products = new HashSet<>();

    public static void main(String[] args) {
        Product one = new Product(1L, "bread", "bakery");
        Product two = new Product(2L, "cheese", "milk");
        Product three = new Product(3L, "yogurt", "milk");
        Product four = new Product(4L, "cake", "bakery");
        Product five = new Product(5L, "sausage", "meat");
        Product six = new Product(6L, "kolbasa", "meat");

        HashSet<Product> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        set.add(five);
        set.add(six);
        System.out.println(groupProductsByCategory(set));
    }

    public static void addItem(String name, String category) {
        Random random = new Random();
        Product product = new Product(random.nextLong(), name, category);
        products.add(product);
    }

    public static String removeItem(String name, String category) {
        Random random = new Random();
        Product product = new Product(random.nextLong(), name, category);
        return products.remove(product) ? "Successfully removed" : "There is no such item";
    }

    public static void printAllItems() {
        products.forEach(System.out::println);
    }

    public static void findItemsByCategory(String category) {
        long count = products.stream()
                .filter(item -> item.getCategory().equals(category))
                .peek(System.out::println)
                .count();
        if (count == 0) {
            System.out.println("There is no element with this category");
        }
    }

    public static HashMap<String, List<Product>> groupProductsByCategory(HashSet<Product> products) {
        // first solution came to mind
//        HashMap<String, List<Product>> result = new HashMap<>();
//        for (Product product : products) {
//            result.putIfAbsent(product.getCategory(), new ArrayList<>());
//            result.get(product.getCategory()).add(product);
//        }
//        return result;

        // second solution
        HashMap<String, List<Product>> result = new HashMap<>();
        products.stream().forEach(item -> result.computeIfAbsent(item.getCategory(), x -> new ArrayList<>()).add(item));
        return result;
    }

    public static void printProductsByCategory(Map<String, List<Product>> groupedProducts) {
        for (Map.Entry<String, List<Product>> item : groupedProducts.entrySet()) {
            System.out.println(item);
        }
    }

}