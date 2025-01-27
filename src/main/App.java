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

    private Set<Contacto> agenda;

    public App() {
        this.agenda = new TreeSet<>(new ContactoComparador());
    }

    private static void runAgenda() {
        
        App app = new App();

        System.out.println("-------AgendaComparador-------");
        // Agregar contactos a la agenda
        app.agenda.add(new Contacto("Alexander", "Smith", "123456789"));
        app.agenda.add(new Contacto("Emily", "Brown", "987654321"));
        app.agenda.add(new Contacto("Alexander", "Smith", "123456789"));

        // Mostrar la agenda
        System.out.println("Agenda:");
        for (Contacto contacto : app.agenda) {
            System.out.println(contacto);
        }
    }
}
