package com.kosta.exam08;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);
        producer.start();
        consumer.start();
    }
}
