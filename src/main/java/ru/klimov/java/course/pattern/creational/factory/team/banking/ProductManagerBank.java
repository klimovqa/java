package ru.klimov.java.course.pattern.creational.factory.team.banking;

import ru.klimov.java.course.pattern.creational.factory.team.ProductManager;

public class ProductManagerBank implements ProductManager {
    @Override
    public void manageProduct() {
        System.out.println("ProductManagerBank manage Product");
    }
}
