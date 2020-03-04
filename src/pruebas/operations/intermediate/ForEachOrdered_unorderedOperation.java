package pruebas.operations.intermediate;

import pruebas.util.MedidorDeTiempos;

import java.util.stream.IntStream;

public class ForEachOrdered_unorderedOperation {

    public static void main(String[] args) {

        // mostrar el medidor de tiempos
        // mostrar el la duración
        ejecutarConjuntoOrdenado();
        ejecutarConjuntoDesordenado();
    }

    private static void ejecutarConjuntoOrdenado() {
        MedidorDeTiempos.medirMilisegundos("Stream paralelo con limit", () -> {
            IntStream stream = IntStream.range(0, 1_000_000_000);

            long procesados = stream.parallel()
                    .filter(i -> i % 2 == 0)
                    .limit(50_000_000)
                    .count();

            System.out.println("PROCESADOS ORDENADOS " + procesados);
        });
    }

    private static void ejecutarConjuntoDesordenado() {
        MedidorDeTiempos.medirMilisegundos("Stream paralelo desordenado con limit", () -> {
            IntStream stream = IntStream.range(0, 1_000_000_000);

            long procesados = stream.unordered().parallel()
                    .filter(i -> i % 2 == 0)
                    .limit(50_000_000)
                    .count();

            System.out.println("PROCESADOS DESORDENADOS " + procesados);
        });
    }

}
