package PROYECTO.ARQUITECTURA;

public class Conversion {


	    public static int aDecimal(NumeroBase num) {
	        return Integer.parseInt(num.getValue(), num.getBase());
	    }

	    public static String deDecimal(int numero, int base) {
	        return Integer.toString(numero, base).toUpperCase();
	    }
}	