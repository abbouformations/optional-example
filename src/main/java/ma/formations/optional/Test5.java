package ma.formations.optional;

import java.util.Optional;

public class Test5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        if (optional.isPresent()) {
            System.out.println(optional.get()); // Affiche: Hello
        }
    }
}
