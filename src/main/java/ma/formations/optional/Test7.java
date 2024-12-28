package ma.formations.optional;

import java.util.Optional;

public class Test7 {
    public static void main(String[] args) {
        Object name = Optional.ofNullable(null).orElseGet(() -> "Generated Name");
        System.out.println(name); // Affiche: Generated Name
    }
}
