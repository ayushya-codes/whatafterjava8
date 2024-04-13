### Source: 


## Features:
* 339:	Edwards-Curve Digital Signature Algorithm (EdDSA)
* 360:	Sealed Classes (Preview)
* 371:	Hidden Classes
* 372:	Remove the Nashorn JavaScript Engine
* 373:	Reimplement the Legacy DatagramSocket API
* 374:	Disable and Deprecate Biased Locking
* 375:	Pattern Matching for instanceof (Second Preview)
* 377:	ZGC: A Scalable Low-Latency Garbage Collector
* 378:	Text Blocks
* 379:	Shenandoah: A Low-Pause-Time Garbage Collector
* 381:	Remove the Solaris and SPARC Ports
* 383:	Foreign-Memory Access API (Second Incubator)
* 384:	Records (Second Preview)
* 385:	Deprecate RMI Activation for Removal


### Edwards-Curve Digital Signature Algorithm (EdDSA)
Implement cryptographic signatures using the Edwards-Curve Digital Signature Algorithm (EdDSA) as described by RFC 8032.

### Sealed Classes (Preview)
- Check practicals

### Hidden Classes
- Check practicals

### Remove the Nashorn JavaScript Engine
Remove the Nashorn JavaScript script engine and APIs, and the jjs tool. The engine, the APIs, and the tool were 
deprecated for removal in Java 11 with the express intent to remove them in a future release.

### Reimplement the Legacy DatagramSocket API
Replace the underlying implementations of the java.net.DatagramSocket and java.net.MulticastSocket APIs with simpler 
and more modern implementations that are easy to maintain and debug.

### Disable and Deprecate Biased Locking
Disable biased locking by default, and deprecate all related command-line options.

Prior to JDK 15, biased locking is always enabled and available. With this JEP, biased locking will no longer be
enabled when HotSpot is started unless -XX:+UseBiasedLocking is set on the command line.

### Pattern Matching for instanceof (Second Preview)
We did a practical in JDK-14 for this - please refer to it.

### ZGC: A Scalable Low-Latency Garbage Collector
Change the Z Garbage Collector from an experimental feature into a product feature.

### Text Blocks
Add text blocks to the Java language. A text block is a multi-line string literal that avoids the 
need for most escape sequences, automatically formats the string in a predictable way, and gives 
the developer control over the format when desired.

### Shenandoah: A Low-Pause-Time Garbage
Change the Shenandoah garbage collector from an experimental feature into a product feature.

### Remove the Solaris and SPARC Ports
Remove the source code and build support for the Solaris/SPARC, Solaris/x64, and Linux/SPARC ports. 
These ports were deprecated for removal in JDK 14.

### Foreign-Memory Access API (Second Incubator) (Discussed as part of JDK-14)
Introduce an API to allow Java programs to safely and efficiently access foreign memory 
outside of the Java heap.

### Records (Second Preview)
Enhance the Java programming language with records, which are classes that act as transparent 
carriers for immutable data. Records can be thought of as nominal tuples.

### Deprecate RMI Activation for Removal
Deprecate the RMI Activation mechanism for future removal. RMI Activation is an obsolete part of 
RMI that has been optional since Java 8. No other part of RMI will be deprecated.