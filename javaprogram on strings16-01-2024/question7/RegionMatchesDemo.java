public class RegionMatchesDemo {
    public static void main(String[] args) {
        String mainString = "Welcome to Bmsce College of Engineering";
        String subString = "Bmsce college";

        // Using regionMatches()
        boolean isMatched = mainString.regionMatches(11, subString, 0, subString.length());

        if (isMatched) {
            System.out.println("Substring is matched");
        } else {
            System.out.println("Substring is not matched");
        }
    }
}
