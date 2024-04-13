package com.leanquitous.java_nine;

/**
 * Bydefault interface methods are public and abstract.
 * <p>
 * In Java 8 we allowed default methods to be part of an interface too - default methods used to have the implementation
 * <p>
 * In Java 9 - private methods are also allowed to be part of an interface.
 * <p>
 * <pre>
 * <b>WHY?</b>
 * - Default methods introduced code that could execute and is common for multiple implementations of the inteface.
 * - Now these feature allows to have more than one default methods and hence code duplication can be a problem.
 * - to handle the problem of code duplication and to keep that code hidden within interfaces they are now allowed to
 * have private methods from JDK 9.
 * - By default methods are public and abstract in interfaces.
 * - "default" and "static" doesn't work together - if it is allowed then by definition of Java Language you can't inherit
 * the static members and that would loose the whole purpose of having default methods in first place.
 * - "abstract and "static" also doesn't work together - Because abstract methods always need implementation by subclass.
 * But if you make any method to static then overriding is not possible for this method
 * </pre>
 */
public interface PrivateMethodsInInterface {

    public abstract void customMessagePrinter(String message);

    public default void printMessage() {
        String msg = "Hello world of Java 9!!";
        print(msg);
        printPrivate(msg);
    }

    private static void print(String str) {
        System.out.println("Private and Static method says - " + str);
    }

    private void printPrivate(String str) {
        System.out.println("ONLY Private method says - " + str);
    }

}
