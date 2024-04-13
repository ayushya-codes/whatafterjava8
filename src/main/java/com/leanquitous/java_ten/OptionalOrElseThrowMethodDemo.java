package com.leanquitous.java_ten;

import java.util.Optional;

public class OptionalOrElseThrowMethodDemo {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Helloo!!!!");
        System.out.println( optionalString.orElseThrow(() -> new RuntimeException("Optional with value so this won't be thrown")));

        Optional<String> optional = Optional.empty();
        optional.orElseThrow(() -> new RuntimeException("Demo of else throw!!"));
    }
}
