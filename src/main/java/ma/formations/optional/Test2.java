package ma.formations.optional;

import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("Java");
        System.out.println(optionalName.get()); // Affiche: Java
    }
}
