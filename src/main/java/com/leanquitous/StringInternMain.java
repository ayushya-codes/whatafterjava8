package com.leanquitous;

/**
 * Purpose:
 *  The purpose of this program is to check what  {@link String#intern()} method does!
 *
 */
public class StringInternMain {

    public static void main(String[] args) {

        String HELLO_STRING = "hello";

//        String HELLO_STRING = "hello".intern();
        // You can call this BUT this is NOT required as by default string literals are stored in constant pool
        // Being maintained as part of the String class itself.

        System.out.println(HELLO_STRING);

        String s1 = new String("hello");
        System.out.println(s1 == HELLO_STRING);


        // Using intern()
        System.out.println("After using string intern on different object!");
        String s2 = new String("hello").intern();
        System.out.println(s2 == HELLO_STRING);

        System.out.println("Intern method returns a string from constant pool if available, and if not it adds that string" +
                "to constant pool so it can be used further. Both occurances of same string refer to same object in constant pool.");

    }
}
