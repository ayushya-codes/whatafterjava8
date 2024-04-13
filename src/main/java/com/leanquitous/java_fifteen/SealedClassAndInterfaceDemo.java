package com.leanquitous.java_fifteen;

/**
 * the main motivation behind sealed classes is to have the possibility for a superclass to be widely
 * accessible but not widely extensible.
 *
 * Most of the time purpose of inheritence is the reuse of the code but in some case we would want the inheritance as
 * a means of mimicing real world entities too compare to the code reuse. In such cases existing java features doesn't
 * allow full kind of controls to control the inheritance that we want to impart to mimic the real world structure.
 *
 * In this case, due to existing limitations we are introduced with Sealed classes and interfaces which help us meet
 * these requirements.
 *
 * <pre>
 * Introduces a couple of new modifiers and clauses in Java:
 *      * sealed
 *      * non-sealed
 *      * permits
 * </pre>
 *
 * Refer this for examples: https://openjdk.org/jeps/360
 *
 * In summary, it should be possible for a superclass to be widely accessible (since it represents an important
 * abstraction for users) but not widely extensible (since its subclasses should be restricted to those known to
 * the author). Such a superclass should be able to express that it is co-developed with a given set of subclasses,
 * both to document intent for the reader and to allow enforcement by the Java compiler. At the same time, the
 * superclass should not unduly constrain its subclasses by, e.g., forcing them to be final or preventing them from
 * defining their own state.
 *
 * A sealed class or interface can be extended or implemented only by those classes and interfaces permitted to do so.
 *
 * <pre>
 *      package com.example.geometry;
 *
 *      public abstract sealed class Shape permits Circle, Rectangle, Square {...}
 * </pre>
 *
 * classes specified by permits must be located near the superclass: either in same module or in same package.
 *
 * When the permitted subclasses are small in size and number, it may be convenient to declare them in the same
 * source file as the sealed class. When they are declared in this way, the sealed class may omit the permits clause,
 * and the Java compiler will infer the permitted subclasses from the declarations in the source file (which may be
 * auxiliary or nested classes).
 */
public class SealedClassAndInterfaceDemo {
    public static void main(String[] args) {

    }
}
