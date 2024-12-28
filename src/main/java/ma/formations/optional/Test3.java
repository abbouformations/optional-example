package ma.formations.optional;

import java.util.Optional;

public class Test3 {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.isPresent()); // Affiche: false
    }
}
