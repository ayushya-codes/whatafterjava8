## Source
https://openjdk.org/projects/jdk/16/

## Features

* 338:	Vector API (Incubator)
* 347:	Enable C++14 Language Features
* 357:	Migrate from Mercurial to Git
* 369:	Migrate to GitHub
* 376:	ZGC: Concurrent Thread-Stack Processing
* 380:	Unix-Domain Socket Channels
* 386:	Alpine Linux Port
* 387:	Elastic Metaspace
* 388:	Windows/AArch64 Port
* 389:	Foreign Linker API (Incubator)
* 390:	Warnings for Value-Based Classes
* 392:	Packaging Tool
* 393:	Foreign-Memory Access API (Third Incubator)
* 394:	Pattern Matching for instanceof
* 395:	Records
* 396:	Strongly Encapsulate JDK Internals by Default
* 397:	Sealed Classes (Second Preview)

### Vector API (Incubator)
Provide an initial iteration of an incubator module, jdk.incubator.vector, to express vector computations that 
reliably compile at runtime to optimal vector hardware instructions on supported CPU architectures and thus 
achieve superior performance to equivalent scalar computations.

(Practical!)

### Enable C++14 Language Features
Allow the use of C++14 language features in JDK C++ source code, and give specific guidance about which of those 
features may be used in HotSpot code.

### Migrate from Mercurial to Git
Migrate the OpenJDK Community's source code repositories from Mercurial (hg) to Git

### Migrate to GitHub
Host the OpenJDK Community's Git repositories on GitHub. In concert with JEP 357 (Migrate from Mercurial to Git), 
this would migrate all single-repository OpenJDK Projects to GitHub, including both JDK feature releases and JDK 
update releases for versions 11 and later.

### ZGC: Concurrent Thread-Stack Processing
Move ZGC thread-stack processing from safepoints to a concurrent phase.
The ZGC garbage collector (GC) aims to make GC pauses and scalability issues in HotSpot a thing of the past.

### Unix-Domain Socket Channels
Add Unix-domain (AF_UNIX) socket support to the socket channel and server-socket channel APIs in the java.nio.channels 
package. Extend the inherited channel mechanism to support Unix-domain socket channels and server socket channels.

### Alpine Linux Port
Port the JDK to Alpine Linux, and to other Linux distributions that use musl as their primary C library, 
on both the x64 and AArch64 architectures,

### Elastic Metaspace
Return unused HotSpot class-metadata (i.e., metaspace) memory to the operating system more promptly, 
reduce metaspace footprint, and simplify the metaspace code in order to reduce maintenance costs.

### Windows/AArch64 Port
Port the JDK to Windows/AArch64.

### Foreign Linker API (Incubator)
Introduce an API that offers statically-typed, pure-Java access to native code. This API, together with the 
Foreign-Memory API (JEP 393), will considerably simplify the otherwise error-prone process of binding to a native 
library.

### Warnings for Value-Based Classes
Designate the primitive wrapper classes as value-based and deprecate their constructors for removal, prompting 
new deprecation warnings. Provide warnings about improper attempts to synchronize on instances of any 
value-based classes in the Java Platform.

### Packaging Tool
Provide the jpackage tool, for packaging self-contained Java applications.

Without modules

    jpackage --name myapp --input lib --main-jar main.jar --main-class myapp.Main 

With modules

    jpackage --name myapp --module-path lib -m myapp/myapp.Main

### Foreign-Memory Access API (Third Incubator)
Introduce an API to allow Java programs to safely and efficiently access foreign memory 
outside of the Java heap.

### Pattern Matching for instanceof
Enhance the Java programming language with pattern matching for the instanceof operator. Pattern matching 
allows common logic in a program, namely the conditional extraction of components from objects, to be 
expressed more concisely and safely.

This is already demoed in JDK-14.

### Records
Demo for this is in JDK - 14.

### Strongly Encapsulate JDK Internals by Default
Strongly encapsulate all internal elements of the JDK by default, except for critical internal APIs such 
as sun.misc.Unsafe. Allow end users to choose the relaxed strong encapsulation that has been the default since JDK 9.

### Sealed Classes (Second Preview)
Look for demo in JDK 15