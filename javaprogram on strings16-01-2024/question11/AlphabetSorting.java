import java.util.Arrays;

public class AlphabetSorting {
    public static void main(String[] args) {
        String[] words = {"van", "watch", "ball", "cat", "xmas", "yatch", "zee", "apple", "ice", "jug", "kite", "lift",
                          "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring", "star",
                          "tree", "umbrella"};

        Arrays.sort(words);

        System.out.println("Sorted Words: " + Arrays.toString(words));
    }
}
