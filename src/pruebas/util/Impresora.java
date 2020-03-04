package pruebas.util;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;

public class Impresora {

    public static void imprimir(String titulo, Collection<?> lista) {

        System.out.println("\n");
        System.out.println("================ " + titulo + "================ ");
        lista.forEach(System.out::println);
    }

    public static void imprimir(String titulo, Map<?, ?> mapa) {

        System.out.println("\n");
        System.out.println("================ " + titulo + "================ ");
        mapa.forEach((k, v) -> System.out.println(k + "::" + v));
    }

    public static void imprimir(String titulo, Object objeto) {

        System.out.println("\n");
        System.out.println("****** " + titulo + " :: " + objeto);
    }

    public static void imprimir(Object objeto) {

        System.out.println("\n");
        System.out.println(objeto);
    }

    public static void imprimirTitulo(String objeto) {

        System.out.println("\n");
        System.out.println("***************" + Optional.ofNullable(objeto).map(String::toUpperCase).orElse("EMPTY") + "****************\n");
    }

    public static void imprimirDosLineas() {

        System.out.println("\n\n");
    }

    public static void imprimirCaracteristicas(String nombre, Spliterator<?> spliterator) {

        System.out.println("\n\n ***************************************" + nombre);
        if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }

        if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }

        if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }

        if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }

        if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }

        if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }

        if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }
        System.out.println("\n");

    }
}