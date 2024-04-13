package com.leanquitous.java_nine;

/**
 * Demonstrates the improvements in the process API.
 * Two new interfaces are added that are
 * {@link ProcessHandle} and {@link ProcessHandle.Info}
 * <p>
 * A sample class using both of them below.
 */
public class ProcessAPIImprovement {

    public static void main(String[] args) {
        // Gives the handle of current running process
        ProcessHandle processHandle = ProcessHandle.current();

        System.out.println(processHandle.pid());

        System.out.println(processHandle.info().toString());
    }
}
