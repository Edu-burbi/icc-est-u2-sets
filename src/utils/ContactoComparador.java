package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        int compareApellido = c1.getApellido().compareTo(c2.getApellido());
        if (compareApellido != 0) {
            return compareApellido;
        }
        return c1.getNombre().compareTo(c2.getNombre());
    }
}