Source --- https://www.digitalocean.com/community/tutorials/java-10-features &
https://www.oracle.com/java/technologies/javase/10-relnote-issues.html

➜ Java based JIT COMPILER SUPPORT (GRAAL VM) at Java 10 this is available as an experimental feature.
    -XX:+UnlockExperimentalVMOptions -XX:+UseJVMCICompiler - to enable this experimental feature.
    This features helps in improving the startup footprint, extends existing class data sharing feature to allow
    application classes to be placed in the shared archive.s
➜ System Property to Disable JRE Last Usage Tracking
➜ Hashed Passwords for Out-of-the-Box JMX Agent (clear passwords present in the jmxremote.password file are now being
over-written with their SHA3-512 hash by the JMX agent.)
➜ JEP 307 Parallel Full GC for G1 (Full G1 GC is now operating parallely, earlier it used to be a single thread
implementation)
➜ Bytecode Generation for Enhanced for Loop
    List<String> data = new ArrayList<>(); for (String b : data);
    The following is the code generated after the enhancement:

    {
        /*synthetic*/
        Iterator i$ = data.iterator();
        for (; i$.hasNext(); ) {
            String b = (String)i$.next();
        } b = null; i$ = null;
    }
    Declaring the iterator variable outside of the for loop allows a null to be assigned to it as soon as it is no
    longer used. This makes it accessible to the GC, which can then get rid of the unused memory.

➜ JDK 10 onwards Oracle is promoting usage of OpenJDK as the primary JDK instead of Oracle JDK.
➜ JDK versioning is based on time versioning.
    java -version
    java version "10" 2018-03-20
    Java(TM) SE Runtime Environment 18.3 (build 10+46) (18 is the year 2018 and 3 is the month)
    Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10+46, mixed mode) (10 is the Java version and 46 is the build number)

