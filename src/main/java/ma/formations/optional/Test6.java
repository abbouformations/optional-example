package ma.formations.optional;

import java.util.Optional;

public class Test6 {
    public static void main(String[] args) {
        Object name = Optional.ofNullable(null).orElse("Default Name");
        System.out.println(name); // Affiche: Default Name

    }
}
