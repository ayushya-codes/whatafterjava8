#### Source - https://openjdk.org/projects/jdk/13/

### Features:
* 350:	Dynamic CDS Archives
* 351:	ZGC: Uncommit Unused Memory
* 353:	Reimplement the Legacy Socket API
* 354:	Switch Expressions (Preview) (We already did demo in JDK 12 features!)
* 355:	Text Blocks (Preview)


#### Dynamic CDS Archives
Extend application class-data sharing to allow the dynamic archiving of classes at the end of Java application execution. 
The archived classes will include all loaded application classes and library classes that are not present in the default, 
base-layer CDS archive.

#### ZGC: Uncommit Unused Memory
Enhance ZGC to return unused heap memory to the operating system.

#### Reimplement the Legacy Socket API 
Replace the underlying implementation used by the java.net.Socket and java.net.ServerSocket APIs with a simpler and 
more modern implementation that is easy to maintain and debug. The new implementation will be easy to adapt to work 
with user-mode threads, a.k.a. fibers, currently being explored in Project Loom.

#### Switch Expression (Preview - 2)
Extend switch so it can be used as either a statement or an expression, and so that both forms can use either 
traditional case ... : labels (with fall through) or new case ... -> labels (with no fall through), with a further 
new statement for yielding a value from a switch expression.
