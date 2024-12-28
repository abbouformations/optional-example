package ma.formations.optional;

import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent()); // Affiche: false
    }
}
