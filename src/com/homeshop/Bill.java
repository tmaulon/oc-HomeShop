package com.homeshop;

import java.util.Map;

public class Bill {
    private Client client;
    private Map<Product, Integer> products;

    public Bill(Client client) {
        this.client = client;
    }

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }

    public Client getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
