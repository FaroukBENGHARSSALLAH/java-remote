java-remote-rmi
==========================

In this project, I implement a basic RMI client which will connect to a running RMI Server.

- [x] Java RMI Client
- [x] Java RMI Server

The Java Remote Method Invocation (Java RMI) is an API that performs remote method invocation, the object-oriented equivalent of remote procedure calls (RPC), with support for direct transfer of serialized Java classes and distributed garbage collection.

1- The original implementation depends on Java Virtual Machine (JVM) class representation mechanisms and it thus only supports making calls from one JVM to another. The protocol underlying this Java-only implementation is known as Java Remote Method Protocol (JRMP).
2- In order to support code running in a non-JVM context, a CORBA version was later developed.

Usage of the term RMI may denote solely the programming interface or may signify both the API and JRMP, IIOP, or another implementation, whereas the term RMI-IIOP (read: RMI over IIOP) specifically denotes the RMI interface delegating most of the functionality to the supporting CORBA implementation.
