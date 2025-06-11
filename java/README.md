# godlp Java Port (Partial)

This directory contains an experimental Java implementation of a subset of the
original [godlp](../README.md) project. The Java version aims to provide similar
APIs for sensitive data detection, but only a small portion is ported for now.

## Building

```
mvn package
```

## Example

```
java -cp target/godlp-java-1.0-SNAPSHOT.jar com.bytedance.godlp.Main
```

This will run a simple demo detecting sensitive patterns using regular
expressions.
