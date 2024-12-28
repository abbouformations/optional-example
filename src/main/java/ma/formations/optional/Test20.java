package ma.formations.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test20 {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("a");
        List<String> collect = value.stream().map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(System.out::println); ; // affiche : A
    }
}
