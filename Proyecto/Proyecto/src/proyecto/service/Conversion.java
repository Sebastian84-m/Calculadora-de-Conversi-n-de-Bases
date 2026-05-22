package proyecto.service;

import proyecto.model.NumeroBase;

public class Conversion {

    // Convierte cualquier base a decimal
    public static int aDecimal(NumeroBase num) {

        return Integer.parseInt(
            num.getValor(),
            num.getBase()
        );
    }

    // Convierte decimal a otra base
    public static String deDecimal(int decimal, int baseDestino) {

        return Integer.toString(decimal, baseDestino)
                      .toUpperCase();
    }
}