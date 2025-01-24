package utils;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ContactoComparador {

    public Set<Contacto> construirContactoComparador() {
        Comparator<Contacto> comparadorPorLongitud = new Comparator<Contacto>() {
            @Override
            public int compare(Contacto s1, Contacto s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<Contacto> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);
        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Pera");

        return miTreeSetComparador;
    }
}



