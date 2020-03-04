package pruebas.operations.mostrar;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DeterministicVsNonDeterministic {

    public static void main(String[] args) {

        String[] arrayStrings = {"manzana", "aguacate", "pera", "naranja", "uva", "fresa", "mango", "mora"};
        Set<String> strings = new TreeSet<>(Arrays.asList(arrayStrings));

        System.out.println(strings.parallelStream().findFirst());
    }
}
