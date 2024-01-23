public class StringBufferDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // Demonstrating various StringBuffer functions
        System.out.println("Original StringBuffer: " + stringBuffer);
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Char at index 7: " + stringBuffer.charAt(7));

        // Modify character at index 7
        stringBuffer.setCharAt(7, ',');
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // Get characters into a char array
        char[] charArray = new char[5];
        stringBuffer.getChars(7, 12, charArray, 0);
        System.out.println("Char Array: " + new String(charArray));

        // Append
        stringBuffer.append(" Welcome!");
        System.out.println("Appended StringBuffer: " + stringBuffer);

        // Insert
        stringBuffer.insert(5, " to");
        System.out.println("Inserted StringBuffer: " + stringBuffer);

        // Reverse
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);

        // Delete
        stringBuffer.delete(7, 15);
        System.out.println("Deleted StringBuffer: " + stringBuffer);

        // DeleteCharAt
        stringBuffer.deleteCharAt(5);
        System.out.println("DeletedCharAt StringBuffer: " + stringBuffer);

        // Replace
        stringBuffer.replace(0, 5, "Hola");
        System.out.println("Replaced StringBuffer: " + stringBuffer);

        // Substring
        System.out.println("Substring (2, 6): " + stringBuffer.substring(2, 6));
    }
}
