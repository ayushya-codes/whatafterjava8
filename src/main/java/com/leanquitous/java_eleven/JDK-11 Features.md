Source -- https://www.oracle.com/java/technologies/javase/11-relnote-issues.html


#### What's new in JDK - 11?
* JEP 327 Unicode 10, Upgrade of existing platform APIs to support the version 10.0.0 of the unicode.
* Bitcoin sign is available now!
* Standardized HTTP client API in JDK 9 and update in JDK-10, this is now standard HTTP Client.
* Lazy Allocation of compiler thread (In tiered compilation mode which is on by default, the VM starts a 
large number of compiler threads on system with many CPUs, regardles of available memory and number of compilation 
requests, because threads consume resources even if they are idle-which is almost all the time, this leads to 
inefficient use of resources for this - -XX:+UseDynamicNumberOfCompilerThreads flag is added.)
* ZGC (Z garbage collector, it is a concurrent garbage collector) - Experimental as part of JDK 11, is introduced which addresses following
 goals.
  * Pause time do not exceed more than 10 ms.
  * Pause time do not increase with the heap or live set size.
  * Handle heaps ranging from few MBs to Terabytes in size!
* Epsilon GC - It simply allocates the memory and doesn't do anything to deallocate the allocated memory, this 
can be used for the purpose of testing, performance testing. Assert memory footprint and memory pressure during test phase.
* Low Overhead heap profiling - JVMTI (Java Virtual Machine Tool Inteface)
  * Low overhead enough to be continuously enabled by default.
  * Accessible via well defined programmatic interface.
  * Can sample all allocations.
  * Can be defined in an implementation independent way.
  * Can give info on dead or alive java objects.
* NEST based access control - Nests allow classes that are logically part of the same code entity, but which are compiled 
to distinct class files, to access each other's private members without the need for compilers to insert 
 accessibility-broadening bridge methods. The rules of Java Language are STILL THE SAME!
* Key Agreement with Curve25519 and Curve448 (Elliptic Curves for Security), 
* Added Brainpool EC Support (RFC 5639)
* ChaCha20 and Poly1305 Cryptographic Algorithms
* Enhanced KeyStore Mechanisms
* RSASSA-PSS Signature Support Added to SunMSCAPI
* JEP 332 Transport Layer Security (TLS) 1.3
* Support for AES Encryption with HMAC-SHA2 for Kerberos 5 Defined in RFC 8009
* JEP 323: Local-Variable Syntax for Lambda Parameters
* Launch Single-File Source-Code Program i.e. if your entire application is contained within a single file you don't need to 
compile it, you can simply run the file using java as command instead of first doing javac and java! 
* JavaFX is separately available module.
* JDK Mission Control (JMC) is also separately available module.