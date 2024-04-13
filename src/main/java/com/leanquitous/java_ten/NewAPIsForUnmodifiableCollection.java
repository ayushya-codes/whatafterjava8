package com.leanquitous.java_ten;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Several new APIs have been added that facilitate the creation of unmodifiable collections. The List.copyOf,
 * Set.copyOf, and Map.copyOf methods create new collection instances from existing instances. New methods
 * toUnmodifiableList, toUnmodifiableSet, and toUnmodifiableMap have been added to the Collectors class in the
 * Stream package. These allow the elements of a Stream to be collected into an unmodifiable collection.
 * <p>
 * <p>
 * <p>
 * -------------------------------------- NOTE --------------------------------------
 * And this method will allow nulls so starting from Java 16 we will have a
 * <p>
 * mutable/null-friendly----->Collectors.toList()
 * immutable/null-friendly--->Stream.toList()
 * immutable/null-hostile---->Collectors.toUnmodifiableList() //Naughty
 */
public class NewAPIsForUnmodifiableCollection {

    public static void main(String[] args) {
        List<String> list = List.of("AK-47", "AK-203", "MP4", "Tavor", "M4A1");

        // Copy of demo!
        System.out.println(List.copyOf(list));
        list.stream().filter(str -> str.contains("-")).toList().forEach(System.out::println);

        List<String> unmodifiedList = list.stream().filter(str -> !str.contains("-")).collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiedList);
    }
}
