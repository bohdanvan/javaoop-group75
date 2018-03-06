package com.bvan.oop.lesson3.hw.menu;

/**
 * @author bvanchuhov
 */
public class MenuRunner {

    public static void main(String[] args) {
        Dish d1 = new Dish("Olivie", "Popular salad", 70);
        Dish d2 = new Dish("Makarony Po Flotsky", "..", 60);

        Menu menu = new Menu("Student Lunch");
        menu.addDish(d1);
        menu.addDish(d2);

        System.out.println(menu);
    }
}
