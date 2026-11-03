package main;

import datastructures.CategoryManager;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to BookStore Management System!");

        CategoryManager categoryManager = new CategoryManager();

        categoryManager.addCategory("Fiction");
        categoryManager.addCategory("Horror");
        categoryManager.addCategory("Fantasy");

        categoryManager.displayCategories();
    }
}
