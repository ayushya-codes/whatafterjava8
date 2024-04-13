package com.leanquitous.java_eleven;

import java.util.function.Predicate;

public class VarNowAvailableForLambda {

    public static void main(String[] args) {
        // NOTE THE var in Lambda parameter.
        Predicate<String> filter = (var str) -> {
            return str.contains("-");
        };
    }

}
