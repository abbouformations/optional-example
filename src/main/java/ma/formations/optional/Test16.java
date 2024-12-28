package ma.formations.optional;

import java.util.Optional;

public class Test16 {
    public static void main(String[] args) {
        //given
        String expected = "properValue";
        Optional<String> value = Optional.of(expected);
        Optional<String> defaultValue = Optional.of("default");

        //when
        Optional<String> result = value.or(() -> defaultValue);
        System.out.println(result.get()); // Affiche: properValue
    }
}
