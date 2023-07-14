package com.linkedin.generics;

public class TestBoxGenerics {

    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter", "JK Rowling", 0.5));
        bookBox.addItem(new Book("Deep", "Cal", 0.25));
        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox);
        System.out.println("Book counts: " + BoxUtils.getCountOfItems(bookBox));
        System.out.println("Total weight of book box: "+bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "Indo", "Yellow", 0.5));
        fruitBox.addItem(new Fruit("Banana", "Brazil", "Green", 0.3));
        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox);
        System.out.println("Fruit counts: " + BoxUtils.getCountOfItems(fruitBox));
        System.out.println("Total weight of fruit box: "+fruitBox.getTotalWeight());
    }
}
