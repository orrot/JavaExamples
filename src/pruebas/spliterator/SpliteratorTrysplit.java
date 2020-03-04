package pruebas.spliterator;

import pruebas.util.Impresora;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpliteratorTrysplit {

    public static void main(String[] args) {

        List<Integer> integers = IntStream.range(0, 10_000_000)
                .boxed()
                .collect(Collectors.toList());

        Spliterator<Integer> spliteratorInts1 = integers.spliterator();

        Spliterator<Integer> spliteratorInts2 = spliteratorInts1.trySplit();

        Impresora.imprimir("Spliterator mitad 1 ", spliteratorInts2.getExactSizeIfKnown());
        Impresora.imprimir("Spliterator mitad 2 ", spliteratorInts2.getExactSizeIfKnown());
    }

}
