package ru.klimov.java.course.pattern.factory.team.banking;

import ru.klimov.java.course.pattern.factory.team.ProductManager;

public class ProductManagerBank implements ProductManager {
    @Override
    public void manageProduct() {
        System.out.println("ProductManagerBank manage Product");
    }
}
