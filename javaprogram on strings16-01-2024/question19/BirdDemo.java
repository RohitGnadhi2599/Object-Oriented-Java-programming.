public class BirdDemo {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();
    }
}
