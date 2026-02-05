# Compiler vs Interpreter

## Compiler
A compiler is a program that translates the entire source code into machine code before execution.

**Characteristics:**
- Converts all code at once
- Produces executable files
- Faster runtime execution
- Requires compilation step before running
- Examples: C, C++, Java (bytecode compilation)

## Interpreter
An interpreter executes source code line-by-line without pre-compilation.

**Characteristics:**
- Executes code directly
- No separate executable file
- Slower runtime execution
- Immediate execution
- Examples: Python, JavaScript, Ruby

## Key Differences

| Aspect | Compiler | Interpreter |
|--------|----------|-------------|
| Translation | All at once | Line by line |
| Execution | After compilation | Immediate |
| Speed | Faster | Slower |
| Memory | More memory during compilation | Less memory |
| Error Detection | Before execution | During execution |

## Hybrid Approach
Some languages like Java use both:
- **Compiler**: Converts source code to bytecode
- **Interpreter**: JVM interprets bytecode at runtime
