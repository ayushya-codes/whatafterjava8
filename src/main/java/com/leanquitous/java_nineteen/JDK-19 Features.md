## Source
https://openjdk.org/projects/jdk/19/

## Features
* 405:	Record Patterns (Preview)
* 422:	Linux/RISC-V Port
* 424:	Foreign Function & Memory API (Preview)
* 425:	Virtual Threads (Preview)
* 426:	Vector API (Fourth Incubator)
* 427:	Pattern Matching for switch (Third Preview)
* 428:	Structured Concurrency (Incubator)

### Record Patterns (Preview)
Enhance the Java programming language with record patterns to deconstruct record values. Record patterns 
and type patterns can be nested to enable a powerful, declarative, and composable form of data navigation 
and processing. This is a preview language feature.

Record Patterns are added with GENERICS!

### Linux/RISC-V Port
Port the JDK to Linux/RISC-V.
Adding support for Linux -RISC-V architecture.

RISC-V is a free and open-source RISC instruction set architecture (ISA) designed originally at the 
University of California, Berkeley, and now developed collaboratively under the sponsorship of RISC-V 
International. It is already supported by a wide range of language toolchains. With the increasing 
availability of RISC-V hardware, a port of the JDK would be valuable.

### Foreign Function & Memory API (Preview)
Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime.

### Virtual Threads (Preview)
Introduce virtual threads to the Java Platform. Virtual threads are lightweight threads that dramatically 
reduce the effort of writing, maintaining, and observing high-throughput concurrent applications. This is 
a preview API.

Java developers have relied on threads as the building block of concurrent server applications for nearly 
three decades. Every statement in every method is executed inside a thread and, since Java is multithreaded, 
multiple threads of execution happen at once. The thread is Java's unit of concurrency: a piece of sequential 
code that runs concurrently with — and largely independently of — other such units. Each thread provides a 
stack to store local variables and coordinate method calls, as well as context when things go wrong: 
Exceptions are thrown and caught by methods in the same thread, so developers can use a thread's stack 
trace to find out what happened. Threads are also a central concept for tools: Debuggers step through 
the statements in a thread's methods, and profilers visualize the behavior of multiple threads to help 
understand their performance.

### Vector API (Fourth Incubator)
Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions 
on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

Demo is already part of JDK - 16.

### Pattern Matching for switch (Third Preview)
Enhance the Java programming language with pattern matching for switch expressions and statements. Extending 
pattern matching to switch allows an expression to be tested against a number of patterns, each with a 
specific action, so that complex data-oriented queries can be expressed concisely and safely. This is a 
preview language feature.

Introduction of "When" in the switch case statement!

More details - https://openjdk.org/jeps/427

### Structured Concurrency (Incubator)
Simplify multithreaded programming by introducing an API for structured concurrency. Structured concurrency 
treats multiple tasks running in different threads as a single unit of work, thereby streamlining error 
handling and cancellation, improving reliability, and enhancing observability. This is an incubating API.

* None of the existing ways of multithreading will be eliminated.
* Promote a new style of multi threading which can help improve maintainability, reliability, Observability.

Examples for concurrency is explained in demo - VirtualThreadDemo.java

Virtual Thread vs Platform Thread - https://openjdk.org/jeps/425#Using-virtual-threads-vs--platform-threads

#### Threads and Throughput
Now in traditional java model for concurrency is based on thread per request style. Meaning in a multithreaded 
server environment each incoming request is being handled by a single thread.
 
Now if we wish to increase the throughput of a server than we have to increase the number of requests being 
handled in a server i.e. increase the number of threads for handling requests. The problem with this is that 
threads are limited in numbers, in java threads implementation is based of the OS threads and OS threads are 
costly to manage. because of this the number of threads often becomes a limiting factor for increasing throughput.

Current implementation of JDK is actually limiting the throughput to a level well below a hardware can support.




