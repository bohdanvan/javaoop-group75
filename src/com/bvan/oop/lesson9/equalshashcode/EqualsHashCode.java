package com.bvan.oop.lesson9.equalshashcode;

/**
 * @author bvanchuhov
 */
public class EqualsHashCode {

    public static void main(String[] args) {
        A a = new A(10);
        A b = new A(10);
        A c = new A(20);

        System.out.println("Equals:");
        System.out.println(a.equals(a)); // true
        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // true
        System.out.println(a.equals(c)); // false
        System.out.println();

        System.out.println("Hash code:");
        System.out.println(a.hashCode() == a.hashCode()); // true
        System.out.println(a.hashCode() == b.hashCode()); // true
        System.out.println(a.hashCode() == c.hashCode()); // false, but can be true (collision)
    }

}

class A {
    private final int x;
    private final String s = "a";

    public A(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (x != a.x) return false;
        return s != null ? s.equals(a.s) : a.s == null;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + (s != null ? s.hashCode() : 0);
        return result;
    }
}
