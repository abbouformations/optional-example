package ma.formations.optional;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Test18 {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("properValue");
        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

        // when
        value.ifPresentOrElse(
                v -> successCounter.incrementAndGet(),
                onEmptyOptionalCounter::incrementAndGet);

        System.out.println(successCounter.get()); // Affiche: 1
        System.out.println(onEmptyOptionalCounter.get()); // Affiche: 0
    }
}
