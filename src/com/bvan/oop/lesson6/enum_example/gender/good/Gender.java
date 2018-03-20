package com.bvan.oop.lesson6.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE("This is a male"),
    FEMALE("This is a female"), // not use
    UNDEFINED("This is a undef");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String shortName() {
        return name().substring(0, 1);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "description='" + description + '\'' +
                '}';
    }
}
