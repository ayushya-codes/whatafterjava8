package com.leanquitous.java_eleven;

import java.util.Arrays;
import java.util.Set;

/**
 * This is for the testing of newly added and overridden version of anyCollection.toArray() method!
 * As shown on line 15 we can see that we are trying to convert the set to Array using this method.
 */
public class CollectionsToArrayDemo {
    public static void main(String[] args) {
        Set<String> set = Set.of("AK-47", "AK-203", "MP4", "Tavor", "M4A1");

        // Arrays.toString will pretty print the array!
        System.out.println(Arrays.toString(set.toArray()));
    }
}
