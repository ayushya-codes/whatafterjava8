package com.leanquitous.java_nine;

import java.util.stream.Stream;

/**
 * Some new default methods introduced as part of the stream APIs some important ones are takeWhile() and
 * dropWhile() !!
 * <p>
 * We are trying to show the use of takeWhile below.
 *
 * <b>Be careful with this methods</b>
 *
 * The difference is shown below. with filter() method it is continue to execute till it consumes all members of the stream
 * while with the takeWhile() method refuses to execute further once it fails the condition to meet!
 *
 * PURPOSE OF THESE METHODS???
 *
 *
 */
public class TakeWhileAndDropWhileStreamImprovement {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> {
            System.out.println("inside loop >>> " + i);
            return i > 4 && i < 10;
        }).forEach(System.out::println);


        System.out.println("################ Demo of filter method ##########");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i > 4 && i < 10).forEach(System.out::println);
    }
}
