package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth());  // Task 3: Call method meth() of class A from object of class B

        B objB = new B();
        System.out.println(objB.meth());  // Task 5: Call overridden method meth() from object of class B
    }
}
