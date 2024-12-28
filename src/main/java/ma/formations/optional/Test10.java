package ma.formations.optional;

import java.util.Optional;

public class Test10 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        optional.filter(s -> s.startsWith("H"))
                .ifPresent(System.out::println); // Affiche: Hello
    }
}
