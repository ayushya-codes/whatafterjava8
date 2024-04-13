## Source 
https://openjdk.org/projects/jdk/17/

## Features
* 306:	Restore Always-Strict Floating-Point Semantics
* 356:	Enhanced Pseudo-Random Number Generators
* 382:	New macOS Rendering Pipeline
* 391:	macOS/AArch64 Port
* 398:	Deprecate the Applet API for Removal
* 403:	Strongly Encapsulate JDK Internals
* 406:	Pattern Matching for switch (Preview)
* 407:	Remove RMI Activation
* 409:	Sealed Classes
* 410:	Remove the Experimental AOT and JIT Compiler
* 411:	Deprecate the Security Manager for Removal
* 412:	Foreign Function & Memory API (Incubator)
* 414:	Vector API (Second Incubator)
* 415:	Context-Specific Deserialization Filters

### Restore Always-Strict Floating-Point Semantics
Make floating-point operations consistently strict, rather than have both strict floating-point 
semantics (strictfp) and subtly different default floating-point semantics. This will restore 
the original floating-point semantics to the language and VM, matching the semantics before the 
introduction of strict and default floating-point modes in Java SE 1.2.

The default floating-point operations are strict or strictfp, both of which guarantee the same 
results from the floating-point calculations on every platform.

NOTE: use of strictfp keyword is no longer required.

### Enhanced Pseudo-Random Number Generators
Provide new interface types and implementations for pseudorandom number generators (PRNGs), 
including jumpable PRNGs and an additional class of splittable PRNG algorithms (LXM).

### New macOS Rendering Pipeline
Implement a Java 2D internal rendering pipeline for macOS using the Apple Metal API as alternative 
to the existing pipeline, which uses the deprecated Apple OpenGL API.

### macOS/AArch64 Port
Port the JDK to macOS/AArch64.

### Deprecate the Applet API for Removal
Deprecate the Applet API for removal. It is essentially irrelevant since all web-browser vendors 
have either removed support for Java browser plug-ins or announced plans to do so

### Strongly Encapsulate JDK Internals
Strongly encapsulate all internal elements of the JDK, except for critical internal APIs such as 
sun.misc.Unsafe. It will no longer be possible to relax the strong encapsulation of internal 
elements via a single command-line option, as was possible in JDK 9 through JDK 16.

### Pattern Matching for switch (Preview) (Update the demo)

### Remove RMI Activation
Remove the Remote Method Invocation (RMI) Activation mechanism, while preserving the rest of RMI.

### Sealed Classes
Check demo in JDK 15

### Remove the Experimental AOT and JIT Compiler
Remove the experimental Java-based ahead-of-time (AOT) and just-in-time (JIT) compiler. This compiler 
has seen little use since its introduction and the effort required to maintain it is significant.

### Deprecate the Security Manager for Removal
Deprecate the Security Manager for removal in a future release.

### Foreign Function & Memory API (Incubator)
Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime.

### Vector API (Second Incubator)
Check the demo in JDK-16.

### Context-Specific Deserialization Filters
Allow applications to configure context-specific and dynamically-selected deserialization filters via 
a JVM-wide filter factory that is invoked to select a filter for each individual deserialization operation.

