public class StringConstructorDemo {

    public static void main(String[] args) {
        // Using String literal
        String str1 = "Hello, World!";
        System.out.println("str1: " + str1);

        // Using the new keyword and a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray);
        System.out.println("str2: " + str2);

        // Using the String(char[] value, int offset, int count) constructor
        char[] sourceCharArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(sourceCharArray, 0, 3); // Creates "Hel"
        System.out.println("str3: " + str3);

        // Using the String(byte[] bytes) constructor
        byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for 'H', 'e', 'l', 'l', 'o'
        String str4 = new String(byteArray);
        System.out.println("str4: " + str4);

        // Using the String(String original) constructor
        String originalString = "Hello";
        String str5 = new String(originalString);
        System.out.println("str5: " + str5);

        // Using StringBuilder and toString() method
        StringBuilder stringBuilder = new StringBuilder("Hello");
        String str6 = stringBuilder.toString();
        System.out.println("str6: " + str6);
    }
}
