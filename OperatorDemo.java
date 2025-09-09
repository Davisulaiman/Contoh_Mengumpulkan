public class OperatorDemo {
    public static void main(String[] args) {
        // ============================
        // 1. Operator Aritmetika
        // ============================
        int a = 10, b = 3;
        System.out.println("=== Operator Aritmetika ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // ============================
        // 2. Operator Relasi
        // ============================
        System.out.println("\n=== Operator Relasi ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ============================
        // 3. Operator Logika
        // ============================
        boolean x = true, y = false;
        System.out.println("\n=== Operator Logika ===");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y : " + (x && y));  // AND
        System.out.println("x || y : " + (x || y));  // OR
        System.out.println("!x     : " + (!x));      // NOT

        // ============================
        // 4. Operator Increment / Decrement
        // ============================
        int c = 5;
        System.out.println("\n=== Operator Increment / Decrement ===");
        System.out.println("c awal   = " + c);
        System.out.println("c++ (post-increment) = " + (c++)); // pakai dulu baru naik
        System.out.println("Setelah c++ , c = " + c);
        System.out.println("++c (pre-increment) = " + (++c)); // naik dulu baru dipakai
        System.out.println("c-- (post-decrement) = " + (c--));
        System.out.println("Setelah c-- , c = " + c);
        System.out.println("--c (pre-decrement) = " + (--c));
    }
}
