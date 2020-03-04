package pruebas.sort;

import java.util.stream.Stream;

public class Sorted_NaturalOrder {

    public static void main(String[] args) {

        Stream.of("Pera", "Mango", "Manzana", "Zanahoria", "aguacate")
                .sorted()
                .forEach(System.out::println);
    }
}
