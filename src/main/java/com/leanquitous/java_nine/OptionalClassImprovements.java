package com.leanquitous.java_nine;

import java.util.Optional;

/**
 * Now you can get a stream of Optional object. The API improvements are demonstrated below.
 */
public class OptionalClassImprovements {

    public static void main(String[] args) {

        // This stream of Optional wasn't available in JDK 8
        Optional<String> optionalString = Optional.of("Aayush");
        optionalString.stream().forEach(System.out::println);

        // Default value specification
        Optional<String> demoString = Optional.empty();
        // Returns a value with default value in a new Optional object!!
        System.out.println(demoString.or(() -> Optional.of("DEFAULT")));


        // ifPresentOrElse then execute first action else you execute second action !!!
        Optional<String> myName = Optional.empty();
        myName.ifPresentOrElse(System.out::println, () -> System.out.println("No Name!!"));
    }
}
