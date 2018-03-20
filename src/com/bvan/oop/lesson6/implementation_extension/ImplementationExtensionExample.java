package com.bvan.oop.lesson6.implementation_extension;

/**
 * @author bvanchuhov
 */
public class ImplementationExtensionExample {

    public static void main(String[] args) {
        X x = new X();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
    void c();
}

class X implements C {

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void c() {
        System.out.println("c");
    }
}

class Y implements A {

    @Override
    public void a() {
        System.out.println("Y: a");
    }
}