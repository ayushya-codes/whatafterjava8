package com.leanquitous.java_nine;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Some of the factory methods/Shortcuts for creating instances of List, Map, Set and Map.Entry are given as
 * part of feature in JDK 9, those shortcut methods/factory methods are explained below.
 *
 * <pre>
 * <b>Why?</b>
 * - Probably for the ease of use and avoiding ceremony for creating just an instance of List, Map, Set etc!
 * </pre>
 */
public class FactoryMethodsForImmutableCollections {

    public static void main(String[] args) {
        String motorcycle1 = "Bajaj Dominar-400";
        String motorcycle2 = "Harley Davidson - 440";
        String motorcycle3 = "RoyalEnfield Himalayan 450";
        String motorcycle4 = "KTM Adventure-390";


        System.out.println("Demo for list !");
        // Immutable
        List<String> emptyListCreation = List.of();
        List<String> demoListCreation = List.of(motorcycle1, motorcycle2, motorcycle3, motorcycle4);
        System.out.println(demoListCreation);

        System.out.println("Demo for set !");
        // Immutable
        Set<String> emptySetCreation = Set.of();
        Set<String> demoSetCreation = Set.of(motorcycle1, motorcycle2, motorcycle3, motorcycle4);
        System.out.println(demoSetCreation);

        System.out.println("Demo for map !");
        // Immutable
        Map<String, String> emptyMapCreation = Map.of();
        Map<String, String> demoMapCreation = Map.of("bajaj",motorcycle1, "Harley", motorcycle2, "Royal Enfield" ,motorcycle3,"KTM" ,motorcycle4);
        System.out.println(demoMapCreation);
    }

}
