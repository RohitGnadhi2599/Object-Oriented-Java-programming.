public class EndsWithDemo {
    public static void main(String[] args) {
        String str = "Bmsce College";

        // Using endsWith()
        boolean endsWithCollege = str.endsWith("College");
        boolean endsWithWorld = str.endsWith("World");

        System.out.println("Ends with College: " + endsWithCollege);
        System.out.println("Ends with World: " + endsWithWorld);
    }
}
