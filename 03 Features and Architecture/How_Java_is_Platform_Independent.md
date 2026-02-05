# How Java is Platform Independent

## Overview
Java is a platform-independent programming language, meaning Java code can run on any device or operating system without modification. This is achieved through the **Write Once, Run Anywhere (WORA)** principle.

## Key Components

### 1. **Java Virtual Machine (JVM)**
- The JVM is an abstract computing machine that interprets compiled Java code
- Acts as an intermediary between the Java code and the underlying operating system
- Each operating system has its own JVM implementation

### 2. **Bytecode**
- Java source code is compiled into bytecode, not machine code
- Bytecode is platform-independent and can execute on any JVM
- The `javac` compiler converts `.java` files to `.class` files containing bytecode

## How It Works

```
Java Source Code (.java)
         ↓
      Javac Compiler
         ↓
    Bytecode (.class)
         ↓
    JVM (Windows/Linux/Mac)
         ↓
    Machine Code (OS-specific)
```

## Advantages

- **Portability**: Same compiled code runs on Windows, Linux, macOS, etc.
- **Security**: JVM provides a controlled environment
- **Consistency**: Behavior remains consistent across platforms

## Example

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Compile once, run everywhere—whether on Windows, Linux, or macOS.
