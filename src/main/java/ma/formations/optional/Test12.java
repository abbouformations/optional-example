package ma.formations.optional;

import java.util.Optional;

public class Test12 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        Optional<Integer> length = optional.flatMap(s -> Optional.of(s.length()));
        System.out.println(length.get()); // Affiche: 4

    }
}
