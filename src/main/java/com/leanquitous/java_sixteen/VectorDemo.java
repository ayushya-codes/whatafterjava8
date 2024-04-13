package com.leanquitous.java_sixteen;

import jdk.incubator.vector.IntVector;

import java.util.Arrays;


/**
 * For this demo I had to add the module-info.java class which specified the requires for jdk.incubator.vector package!
 *
 */
public class VectorDemo {

    public static void olderVersionForArrayMultiplication(int[] a, int[] b) {
        var c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.println(Arrays.toString(c));
    }

    public static void newVersionForArraysMultiplication(int[] a, int[] b) {
        var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
        var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);

        var vectorC = vectorA.mul(vectorB);

        int[] c = vectorC.toArray();

        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        // Check the output:
        newVersionForArraysMultiplication(a, b);
    }
}
