package ma.formations.optional;

import java.util.Optional;

public class Test17 {
    public static void main(String[] args) {

            // given
            String defaultString = "default";
            Optional<String> value = Optional.empty();
            Optional<String> defaultValue = Optional.of(defaultString);

            // when
            Optional<String> result = value.or(() -> defaultValue);

            // then
            System.out.println(result.get()); // Affiche: default

    }
}
