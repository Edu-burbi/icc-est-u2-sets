package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if (comparacionApellido != 0) {
            return comparacionApellido;
        }
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
}