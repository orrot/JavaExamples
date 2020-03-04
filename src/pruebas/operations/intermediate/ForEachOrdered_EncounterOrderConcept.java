package pruebas.operations.intermediate;

import java.util.Arrays;
import java.util.List;

public class ForEachOrdered_EncounterOrderConcept {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        integers.parallelStream()
                .peek(x -> System.out.println("Peek: " + x))
                .forEachOrdered(x -> System.out.println("For Each Ordered: " + x));
    }
}
