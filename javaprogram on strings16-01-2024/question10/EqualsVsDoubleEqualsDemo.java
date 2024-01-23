public class EqualsVsDoubleEqualsDemo {
    public static void main(String[] args) {
        String str1 = new String("Bmsce");
        String str2 = new String("Bmsce");
        String str3 = "Bmsce";

        // Using equals()
        System.out.println("Using equals(): " + str1.equals(str2));

        // Using ==
        System.out.println("Using == : " + (str1 == str2));

        // Comparing with string literal
        System.out.println("Comparing with string literal: " + (str1 == str3));
    }
}
