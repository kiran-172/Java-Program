public class StringComparisonDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "hello";

		// Using equals()
        System.out.println("\nUsing equals() :");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false (case-sensitive)

        // Using ==
        System.out.println("Using == :");
        System.out.println("str1 == str2: " + (str1 == str2)); // false (different references)
        System.out.println("str1 == str1: " + (str1 == str1)); // true (same reference)

        // Using equalsIgnoreCase()
        System.out.println("\nUsing equalsIgnoreCase() :");
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // true (case-insensitive)

        // Using compareTo()
        System.out.println("\nUsing compareTo() :");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0 (equal)
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // negative value (str1 < str3)
        System.out.println("str3.compareTo(str1): " + str3.compareTo(str1)); // positive value (str3 > str1)
    }
}