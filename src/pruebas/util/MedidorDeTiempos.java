package pruebas.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class MedidorDeTiempos {

    public interface Intercepted {

        void interceptMethod();
    }

    public static <T> T medirMilisegundos(String nombre, Supplier<T> supplier) {

        LocalDateTime inicio = LocalDateTime.now();
        T result = supplier.get();
        LocalDateTime fin = LocalDateTime.now();

        long milisegundosTranscurridos = inicio.until(fin, ChronoUnit.MILLIS);
        System.out.println(String.format("La operación %s se ejecutó en %d milisegundos", nombre, milisegundosTranscurridos));
        return result;
    }

    public static void medirMilisegundos(String nombre, Intercepted intercepted) {

        LocalDateTime inicio = LocalDateTime.now();
        intercepted.interceptMethod();
        LocalDateTime fin = LocalDateTime.now();

        long milisegundosTranscurridos = inicio.until(fin, ChronoUnit.MILLIS);
        System.out.println(String.format("La operación %s se ejecutó en %d milisegundos", nombre, milisegundosTranscurridos));
    }
}
