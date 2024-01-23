public class GetCharsDemo {
    public static void main(String[] args) {
        String sentence = "Welcome to Bmsce college";
        char[] targetArray = new char[5];

        sentence.getChars(11, 16, targetArray, 0);

        System.out.println("Extracted Substring: " + new String(targetArray));
    }
}
