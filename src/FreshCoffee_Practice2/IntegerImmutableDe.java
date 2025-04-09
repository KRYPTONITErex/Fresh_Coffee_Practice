package FreshCoffee_Practice2;

public class IntegerImmutableDe {

        public static void main(String[] args) {
            // Demonstrating immutability
            Integer x = 10;

            // This doesn't modify the original object
            // Instead, it creates a new Integer object
            x = x + 5;  // x is now 15, but this is a new object

            // Proving immutability
            Integer original = Integer.valueOf(10);
            System.out.println("Original value: " + original);

            System.out.println(x);

            Integer c = 128;  // Outside cache range
            Integer d = 128;  // New object created
            System.out.println("c == d: " + (c == d));  // false
            System.out.println(c.equals(d));


            // Attempting to modify (which is not possible)
            try {
                // This would cause a compile-time error
                // original.value = 20;  // Not possible!

                // This creates a new object
                original = 20;

                System.out.println("After attempted modification: " + original);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
