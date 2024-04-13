package com.leanquitous.java_nine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Earlier, I mean after JDK 7 and before JDK 9 the implementation of try with resources was somewhat like
 * shown here.
 *
 * <pre>
 * {
 * @code static String readFirstLineFromFile(String path) throws IOException {
 * 	    try (FileReader fr = new FileReader(path);
 * 	         BufferedReader br = new BufferedReader(fr)) {
 * 	        return br.readLine();
 *            }
 *    }
 *    }
 * 	</pre>
 * <p>
 * And now the code is much simpler as shown below - notice the new FileReader is outside of the try( - that's the
 * improvement!
 *
 * Remember the magic happens due to the {@link AutoCloseable} interface!
 */
public class TryWithResourceImprovement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("README"));
        try (bufferedReader) {
            bufferedReader.lines().forEach((System.out::println));
        }
    }
}
