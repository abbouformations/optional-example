package ma.formations.optional;

import java.util.Optional;

public class Test15 {
    public static void main(String[] args) {
        String value = Optional.of("Spring Boot")
                .filter(s -> s.contains("Spring"))
                .map(String::toUpperCase)
                .orElse("Default Value");
        System.out.println(value); // Affiche: SPRING BOOT
    }
}
