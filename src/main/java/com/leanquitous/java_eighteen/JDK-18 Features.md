## Source
https://openjdk.org/projects/jdk/18/

## Features
* 400:	UTF-8 by Default
* 408:	Simple Web Server
* 413:	Code Snippets in Java API Documentation
* 416:	Reimplement Core Reflection with Method Handles
* 417:	Vector API (Third Incubator)
* 418:	Internet-Address Resolution SPI
* 419:	Foreign Function & Memory API (Second Incubator)
* 420:	Pattern Matching for switch (Second Preview)
* 421:	Deprecate Finalization for Removal

### UTF-8 by Default
Specify UTF-8 as the default charset of the standard Java APIs. With this change, APIs that 
depend upon the default charset will behave consistently across all implementations, operating 
systems, locales, and configurations.

### Simple Web Server
Provide a command-line tool to start a minimal web server that serves static files only. No CGI 
or servlet-like functionality is available. This tool will be useful for prototyping, ad-hoc 
coding, and testing purposes, particularly in educational contexts.

    jwebserver

on command line.

    jwebserver -p 8082

    jwebserver -b 0.0.0.0 - for binding it with all interfaces.

### Code Snippets in Java API Documentation
Introduce an @snippet tag for JavaDoc's Standard Doclet, to simplify the inclusion of example 
source code in API documentation.

    {@snippet ....} 

above tag is introduced for the purpose of documentation.
    
    /**
    * The following code shows how to use {@code Optional.isPresent}:
    * {@snippet :
    *    if (v.isPresent()) {
    *       System.out.println("v: " + v.get());
    *    }
    * }
    */

### Reimplement Core Reflection with Method Handles
Reimplement java.lang.reflect.Method, Constructor, and Field on top of java.lang.invoke method handles. 
Making method handles the underlying mechanism for reflection will reduce the maintenance and 
development cost of both the java.lang.reflect and java.lang.invoke APIs.

### Vector API (Third Incubator)
Introduce an API to express vector computations that reliably compile at runtime to optimal vector 
instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

### Internet-Address Resolution SPI
Define a service-provider interface (SPI) for host name and address resolution, so that java.net.InetAddress can 
make use of resolvers other than the platform's built-in resolver.

### Foreign Function & Memory API (Second Incubator)
Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime.

### Pattern Matching for switch (Second Preview)
Enhance the Java programming language with pattern matching for switch expressions and statements, 
along with extensions to the language of patterns.

### Deprecate Finalization for Removal ((finalize method))
Deprecate finalization for removal in a future release. Finalization remains enabled by default 
for now, but can be disabled to facilitate early testing. In a future release it will be disabled 
by default, and in a later release it will be removed.

Java programs enjoy automatic memory management, wherein the JVM's garbage collector (GC) reclaims 
the memory used by an object when the object is no longer needed. However, some objects represent 
a resource provided by the operating system, such as an open file descriptor or a block of native 
memory. For such objects, it is insufficient merely to reclaim the object's memory; the program 
must also release the underlying resource back to the operating system, typically by calling the 
object's close method. If the program fails to do this before the GC reclaims the object then the 
information needed to release the resource is lost. The resource, still considered by the operating 
system to be in use, has leaked.

Finalization (finalize method), introduced in Java 1.0, was intended to help avoid resource leaks.

A class can declare a finalizer — the method protected void finalize() — whose body releases any 
underlying resources. The GC will schedule the finalizer of an unreachable object to be called 
before it reclaims the object's memory; in turn, the finalize method can take actions such as 
calling the object's close method.

More details - https://openjdk.org/jeps/421 