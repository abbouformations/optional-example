package ma.formations.optional;

import java.util.Map;
import java.util.Optional;

public class Test13 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Java", 2, "Python");
        Optional<String> value = Optional.ofNullable(map.get(3));
        String result = value.orElse("Default");
        System.out.println(result); // Affiche: Default
    }
}
