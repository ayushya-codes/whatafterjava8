#### Source - https://openjdk.org/projects/jdk/12/

### Features
* 189:	Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
* 230:	Microbenchmark Suite
* 325:	Switch Expressions (Preview)
* 334:	JVM Constants API
* 340:	One AArch64 Port, Not Two
* 341:	Default CDS Archives
* 344:	Abortable Mixed Collections for G1
* 346:	Promptly Return Unused Committed Memory from G1


#### Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
A new garbage collector called Shenandoah which reduces GC pause times by doing evacuation work concurrently 
with the running Java thread. Pause time with Shenandoah are independent of the heap size meaning the pause time 
will be same for heap size 200MB or 200GB.

Not one GC to rule them all, There are other GCs available for throughput or memory footprint over 
responsiveness. This one is suitable for application which PRIORITISE the responsiveness and predictable short pauses.

#### Microbenchmark Suite
basic suit of benchmark to the JDK source code, and make it easy for developers to run existing 
microbenchmark and create new ones.

#### JVM Constants API
This is more related to the JVM's execution of byte code and these byte code instructions are  stored 
within a constant pool associated with each class.
Java Virtual Machine instructions do not rely on the run-time layout of classes, interfaces, class instances, 
or arrays. Instead, instructions refer to symbolic information in the constant_pool table.

Refer to this link for more details - https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-4.html#jvms-4.4

#### JEP 340: One AArch64 Port, Not Two

#### JEP 341: Default CDS Archives
Enhance the JDK build process to generate a class data-sharing (CDS) archive, using the default class list, 
on 64-bit platforms.

#### JEP 344: Abortable Mixed Collections for G1
Make G1 mixed collections abortable if they might exceed the pause target.

#### JEP 346: Promptly Return Unused Committed Memory from G1
Enhance the G1 garbage collector to automatically return Java heap memory to the operating system when idle.
