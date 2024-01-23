public class StringComparisonDemo {
    public static void main(String[] args) {
        String str1 = "Bmsce";
        String str2 = "BMSCE";
        String str3 = "College";

        // Using equals()
        System.out.println(str1 + " equals " + str1 + " -> " + str1.equals(str1));
        System.out.println(str1 + " equals " + str3 + " -> " + str1.equals(str3));
        System.out.println(str1 + " equals " + str2 + " -> " + str1.equals(str2));

        // Using equalsIgnoreCase()
        System.out.println(str1 + " equalsIgnoreCase " + str2 + " -> " + str1.equalsIgnoreCase(str2));
    }
}
