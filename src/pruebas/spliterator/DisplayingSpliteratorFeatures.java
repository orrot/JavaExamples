package pruebas.spliterator;

import pruebas.util.Impresora;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DisplayingSpliteratorFeatures {

    public static void main(String[] args) {

        Impresora.imprimirCaracteristicas("ArrayList Spliterator ", new ArrayList<Integer>().spliterator());
        Impresora.imprimirCaracteristicas("LinkedList Spliterator ", new LinkedList<Integer>().spliterator());
        Impresora.imprimirCaracteristicas("HashSet Spliterator ", new HashSet<Integer>().spliterator());
        Impresora.imprimirCaracteristicas("TreeSet Spliterator ", new TreeSet<Integer>().spliterator());
        Impresora.imprimirCaracteristicas("Stack Spliterator ", new Stack<Integer>().spliterator());
        Impresora.imprimirCaracteristicas("ConcurrentLinkedQueue Spliterator ", new ConcurrentLinkedQueue<Integer>().spliterator());
    }
}
