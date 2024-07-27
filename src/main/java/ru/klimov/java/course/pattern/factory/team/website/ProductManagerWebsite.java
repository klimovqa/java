package ru.klimov.java.course.pattern.factory.team.website;

import ru.klimov.java.course.pattern.factory.team.ProductManager;

public class ProductManagerWebsite implements ProductManager {
    @Override
    public void manageProduct() {
        System.out.println("ProductManagerWebsite manage Product");
    }
}
