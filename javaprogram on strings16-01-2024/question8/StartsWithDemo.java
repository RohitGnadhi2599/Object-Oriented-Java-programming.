public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "Bmsce College";

        // Using startsWith()
        boolean startsWithBmsce = str.startsWith("Bmsce");
        boolean startsWithHello = str.startsWith("Hello");

        System.out.println("Starts with Bmsce: " + startsWithBmsce);
        System.out.println("Starts with Hello: " + startsWithHello);
    }
}
