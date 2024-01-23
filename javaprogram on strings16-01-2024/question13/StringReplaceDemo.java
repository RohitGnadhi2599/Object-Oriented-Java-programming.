public class StringReplaceDemo {
    public static void main(String[] args) {
        String inputString = "Thwas was a test. Thwas was, too.";

        // Using substring(), indexOf(), and +
        int indexOfWas = inputString.indexOf("was");
        String modifiedString = inputString.substring(0, indexOfWas) + "is" + inputString.substring(indexOfWas + "was".length());

        System.out.println("Modified String: " + modifiedString);
    }
}
