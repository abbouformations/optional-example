package ma.formations.optional;

import java.util.Optional;

public class Test8 {
    public static void main(String[] args) {
        Object name = Optional.ofNullable(null).orElseThrow(() -> new IllegalArgumentException("Value is missing"));
    }
}
