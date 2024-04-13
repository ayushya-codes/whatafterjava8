package com.leanquitous.java_fourteen;

public class PatternMatchingInstanceOfDemo {

    private static void withoutPatternMatching(Object str) {
        if (str instanceof String) {
            // NOTICE THE CASTING WE HAVE TO ADD IT MANUALLY!!
            String string = (String) str;
            System.out.println(string);
        } else {
            System.out.println("str is another object!");
        }
    }

    private static void withPatternMatching(Object object) {
        //NOTICE THE USAGE OF s after String!! That's instanceof Pattern Matching
        if (object instanceof String s) {
            System.out.println(s);
        } else {
            // s in the above if condition is not available here!
            System.out.println("Object passed is not String type!!");
        }
    }

    public static void main(String[] args) {

        withoutPatternMatching("Hello world!!!");

        withPatternMatching("Hello new world of Java 14!!!!");

    }
}
