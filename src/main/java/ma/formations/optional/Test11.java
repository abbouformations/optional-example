package ma.formations.optional;

import java.util.Optional;

public class Test11 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 8");
        optional.ifPresent(System.out::println); // Affiche: Java 8

    }
}
