package com.bvan.oop.lesson9.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class PhoneBook {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new HashMap<>();
//        Map<String, PhoneNumber> phoneBook2 = new LinkedHashMap<>(phoneBook);

        phoneBook.put("Vlad", new PhoneNumber("+380951111111")); // O(1)
        phoneBook.put("Maria", new PhoneNumber("+380951111112"));
        phoneBook.put("Ilya", new PhoneNumber("+380951111113"));

        phoneBook.put("Maria", new PhoneNumber("+380951111114"));

        phoneBook.put("Boris", null); // bad practice

        PhoneNumber maria = phoneBook.get("Maria"); // O(1)
        System.out.println(maria);

        PhoneNumber boris = phoneBook.get("Boris");
        System.out.println(boris);

        System.out.println(phoneBook.containsKey("Boris123"));

        System.out.println();
        Set<String> names = phoneBook.keySet();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        Collection<PhoneNumber> numbers = phoneBook.values();
        for (PhoneNumber number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        Set<Map.Entry<String, PhoneNumber>> items = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> item : items) {
            String name = item.getKey();
            PhoneNumber number = item.getValue();
            System.out.println(name + " -> " + number);
        }
    }
}

class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}