package proyecto.service;

import proyecto.model.NumeroBase;

public class Validacion {

    public static boolean esValido(NumeroBase num) {

        String valor = num.getValor();
        int base = num.getBase();

        // Verificar vacío
        if (valor == null || valor.isEmpty()) {
            return false;
        }

        try {

            // Intenta convertir el número según la base
            Integer.parseInt(valor, base);

            return true;

        } catch (NumberFormatException e) {

            return false;
        }
    }
}