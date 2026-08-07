package Intro;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After x++ = " + x);
        System.out.println("--x = " + (--x)); // Pre-decrement
        System.out.println("x-- = " + (x--)); // Post-decrement
        System.out.println("After x-- = " + x);

        // 3. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int y = 10;
        y += 5;
        System.out.println("y += 5 : " + y);
        y -= 2;
        System.out.println("y -= 2 : " + y);
        y *= 3;
        System.out.println("y *= 3 : " + y);
        y /= 2;
        System.out.println("y /= 2 : " + y);
        y %= 4;
        System.out.println("y %= 4 : " + y);

        // 4. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 5. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean p = true, q = false;
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        // 6. Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");
        int m = 6, n = 3;
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("~m    = " + (~m));

        // 7. Shift Operators
        System.out.println("\n=== Shift Operators ===");
        System.out.println("m << 1 = " + (m << 1));
        System.out.println("m >> 1 = " + (m >> 1));
        System.out.println("m >>> 1 = " + (m >>> 1));

        // 8. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        // 9. instanceof Operator
        System.out.println("\n=== instanceof Operator ===");
        String str = "Hello";
        System.out.println(str instanceof String);
    }
}
