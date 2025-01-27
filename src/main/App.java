package main;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparador;

public class App {

    public static void main(String[] args) throws Exception {

        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
        runAgenda();
    }

    public static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("\n-------HashSet-------");
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
    
    private static void runAgenda() {

        /*
        // Set<Contacto> agenda = new TreeSet<>(new ContactoComparator( x)); 

        Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");

        System.out.println("-------AgendaComparador-------");
        System.out.println("Ejemplo con nombres repetidos");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Referencia en memoria");
        boolean comparacionReferencia = c1 == c2;
        System.out.println(comparacionReferencia);
        System.out.println("c1: " + c1 + " == c2:" + c2 + " = " + comparacionReferencia + "\n");

        System.out.println("comparacionEquals");
        System.out.println(c1.equals(c2));
        boolean comparacionEquals = c1 == c2;
        System.out.println(comparacionEquals);
        System.out.println("c1: " + c1 +" == c2: " + c2 + " = " + comparacionEquals + "\n");

        System.out.println("comparacionHashCode");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);
        System.out.println("c1: " + c1.hashCode() + " == c2: " + c2.hashCode() + " = " + comparacionHashCode);
        */

        // Ahora, usamos un TreeSet para almacenar y ordenar Contactos
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        System.out.println("-------AgendaComparador-------");
        agenda.add(new Contacto("Pedro", "Lopez", "2222222222"));
        agenda.add(new Contacto("Luis", "Perez", "1111111111"));
        agenda.add(new Contacto("Ana", "Perez", "9876543210"));
        agenda.add(new Contacto("Pedro", "Lopez", "1234567890"));

        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }
}

