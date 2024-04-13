package com.leanquitous.java_nine;

/**
 * The purpose of this to demo the stack walking api introduced as part of JDK 9.
 */
public class StackWalkingAPIsDemo {

    static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        // Below code will show normal frames
//        StackWalker stackWalker = StackWalker.getInstance();
//        System.out.println("Using stack walker for output!!!");
//        stackWalker.forEach(System.out::println);
        // OUTPUT FOR ABOVE CODE
//        com.leanquitous.java_nine.StackWalkingAPIsDemo.method3(StackWalkingAPIsDemo.java:18)
//        com.leanquitous.java_nine.StackWalkingAPIsDemo.method2(StackWalkingAPIsDemo.java:13)
//        com.leanquitous.java_nine.StackWalkingAPIsDemo.method1(StackWalkingAPIsDemo.java:9)
//        com.leanquitous.java_nine.StackWalkingAPIsDemo.main(StackWalkingAPIsDemo.java:25)

        // Below code will show hidden frames.
        // In this case the output is same as above as this is really simple example. Refer SHOW_HIDDEN_FRAMES
        // documentation for more details!
        StackWalker stackWalker = StackWalker.getInstance(StackWalker.Option.SHOW_HIDDEN_FRAMES);
        System.out.println("Using stack walker for output!!!");
        stackWalker.forEach(System.out::println);


    }


    public static void main(String[] args) {

        System.out.println("Demo for stack walker API.");
        method1();

    }

}
