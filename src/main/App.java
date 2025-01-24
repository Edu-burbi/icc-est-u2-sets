package main;

import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {

        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
    }

    public static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("-------HashSet-------");
        System.out.println("Elementos del HashSet (no se garantiza el orden)");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("-------LinkedHashSet-------");
        System.out.println("Elementos del LinkedHashSet (Respeta orden de insercion)");
        for (String elemento1 : ejemploLinkedHashSet) {
            System.out.println(elemento1);
        }
    }

    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("-------TreeSet-------");
        System.out.println("Elementos del TreeSet (Orden alfabetico)");
        for (String elemento2 : ejemploTreeSet) {
            System.out.println(elemento2);
        }
    }

    private static void runTreeSetConComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("-------TreeSetConComparador-------");
        System.out.println("Elementos del TreeSetConComparador (Ordenados por longitud y luego en Orden alfabetico)");
        for (String elemento2 : ejemploTreeSetConComparador) {
            System.out.println(elemento2);
        }
    }
}
