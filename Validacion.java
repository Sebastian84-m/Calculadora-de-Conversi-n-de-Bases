package PROYECTO.ARQUITECTURA;

public class Validacion {

    public static boolean Valido(String value, int base) {
        try {
            Integer.parseInt(value, base);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}