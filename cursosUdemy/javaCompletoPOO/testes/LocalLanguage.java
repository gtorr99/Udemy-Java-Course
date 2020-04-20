package javaCompletoPOO.testes;

import java.util.Locale;

public class LocalLanguage {

	public static void main(String[] args) {
		double x = 10.5634;

		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f\n", x);
		System.out.println("Texto1 " + x + " Texto2");
		System.out.printf("Resultado = %.2f metros\n", x);
	}

}
