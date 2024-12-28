package ma.formations.optional;

import java.util.Optional;

public class Test14 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(getNullableValue());
        optional.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Value is absent")
        );
    }

    private static String getNullableValue() {
        return null; // Simulation d'une méthode retournant null
    }
}
