package ma.formations.optional;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Test19 {
    public static void main(String[] args) {
        Optional<String> value = Optional.empty();
        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

        value.ifPresentOrElse(
                v -> successCounter.incrementAndGet(),
                onEmptyOptionalCounter::incrementAndGet);

        System.out.println(successCounter.get()); // Affiche: 0
        System.out.println(onEmptyOptionalCounter.get()); // Affiche: 1
    }
}
