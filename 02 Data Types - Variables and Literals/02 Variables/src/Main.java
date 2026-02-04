public class Main {
    static void main(String[] args) {
        // Variables are containers that store data values
        // Syntax: dataType variableName = value;

        // RULES TO DECLARE VARIABLE NAMES
        /*
        1. Case-sensitive: NAME != name != Name (each is different)
        2. Can contain: letters, digits, underscore (_), or dollar sign ($)
        3. Must start with: letter, underscore (_), or dollar sign ($) - NOT a digit
        4. Cannot be a Java keyword (int, float, class, etc.)
        5. Cannot be a built-in class name (String, Integer, etc.)
        6. Should follow camelCase convention and be meaningful
         */

        // Example 1: Case sensitivity
        String name = "Ankit";
        String NAME = "Anki";
        String Name = "Anku";
        System.out.println(name + ", " + NAME + ", " + Name);  // All three are different variables

        // Example 2: Valid variable names with _ and $
        int _a = 5;      // Starts with underscore
        int $b = 10;     // Starts with dollar sign
        System.out.println(_a + $b);   // 15

        // Example 3: Invalid - cannot start with a digit
        // int 5a = 10;

        // Example 4: Invalid - reserved keywords cannot be used
        // int float = 5;

        // PRIMITIVE DATA TYPES in Java:

        // 1. byte: 8-bit integer (-128 to 127)
        byte b = 5;
        System.out.println("byte b: " + b);

        // 2. int: 32-bit integer (default for whole numbers)
        int x = 20, y = 10;
        int sum = x + y;
        System.out.println("int sum: " + sum);

        // 3. short: 16-bit integer (-32,768 to 32,767)
        short s = 123;
        System.out.println("short s: " + s);

        // 4. long: 64-bit integer (use L suffix)
        long l = 178L;
        System.out.println("long l: " + l);

        // 5. float: 32-bit decimal (use f suffix)
        float f = 1.6f;
        System.out.println("float f: " + f);

        // 6. double: 64-bit decimal (default for decimals)
        double d = 1.677d;
        System.out.println("double d: " + d);

        // 7. char: Single character (use single quotes)
        char c = 'A';
        System.out.println("char c: " + c);

        // 8. String: Reference type for text (use double quotes)
        String text = "Hello Java";
        System.out.println("String text: " + text);
    }
}
