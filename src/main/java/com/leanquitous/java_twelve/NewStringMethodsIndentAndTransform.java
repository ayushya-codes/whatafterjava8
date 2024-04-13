package com.leanquitous.java_twelve;

public class NewStringMethodsIndentAndTransform {
    public static void main(String[] args) {
        String HELLO_WORLD = "Hello World!!";

        System.out.println(HELLO_WORLD + " -- Normal sout !");

        // Indent method demo!
        System.out.println(HELLO_WORLD.indent(15));

        // transform method demo!
        System.out.println(HELLO_WORLD.transform(str -> {
            return new StringBuilder(str).reverse();
        }).toString());


    }
}
