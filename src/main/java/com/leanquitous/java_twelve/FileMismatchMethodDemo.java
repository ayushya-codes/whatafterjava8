package com.leanquitous.java_twelve;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * {@link java.nio.file.Files#mismatch(Path, Path)} method demo!
 */
public class FileMismatchMethodDemo {
    public static void main(String[] args) throws IOException {
        Path file1 = Files.createTempFile("File_1", ".txt");
        Path file2 = Files.createTempFile("File_2", ".txt");

        Files.writeString(file1, "Testing 1234");
        Files.writeString(file2, "Testing 1234");

        long mismatchValue = Files.mismatch(file1, file2);
        // Content matching and hence -1
        System.out.println(mismatchValue);


        Path file3 = Files.createTempFile("File_3", ".txt");
        Path file4 = Files.createTempFile("File_4", ".txt");

        Files.writeString(file3, "Testing 1234");
        Files.writeString(file4, "Testing 1234 --- 1");

        long value = Files.mismatch(file3, file4);
        // The number of byte from where the content is different!
        System.out.println(value);
    }
}
