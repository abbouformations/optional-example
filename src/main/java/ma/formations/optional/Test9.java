package ma.formations.optional;

import java.util.Optional;

public class Test9 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        Optional<Integer> length = optional.map(String::length);
        System.out.println(length.get()); // Affiche: 4

    }
}
