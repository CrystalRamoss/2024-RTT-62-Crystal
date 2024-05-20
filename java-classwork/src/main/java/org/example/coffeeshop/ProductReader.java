package org.example.coffeeshop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {

    public List<Product> readProducts(){
        List<Product> products = new ArrayList<>();

        try {
            File file = new File("products.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String header = bufferedReader.readLine();
            String product = bufferedReader.readLine();

            Product p = parseProduct(product);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    private Product parseProduct(String line) {
        //     0     , 1  , 2, 3
        // Chai Latte,2.99,10,true
        Product result = new Product();

        String[] column = line.split(",");
        result.setName(column[0]);

        double price = Double.parseDouble(column[1]);
        result.setPrice(price);

        int quantity = Integer.parseInt(column[2]);
        result.setQuantityAvailable(quantity);

        boolean beverage = Boolean.parseBoolean(column[3]);
        result.setBeverage(beverage);

        return result;
    }

        public static void main(String[] args) {
        ProductReader pr = new ProductReader();
        pr.readProducts();
    }
}
