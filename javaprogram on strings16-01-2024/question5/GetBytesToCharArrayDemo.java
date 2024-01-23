import java.util.Arrays;

public class GetBytesToCharArrayDemo {
    public static void main(String[] args) {
        // Using getBytes()
        String str1 = "Hello";
        byte[] byteArray = str1.getBytes();
        System.out.println("Byte Array: " + Arrays.toString(byteArray));

        // Using toCharArray()
        String str2 = "World";
        char[] charArray = str2.toCharArray();
        System.out.println("Char Array: " + Arrays.toString(charArray));
    }
}
