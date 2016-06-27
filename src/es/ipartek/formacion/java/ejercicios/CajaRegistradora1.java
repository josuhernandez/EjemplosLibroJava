package es.ipartek.formacion.java.ejercicios;

/**
 * 
 * @author JosuHernandez <br>
 *         Clase ejecutable que calcula las vueltas optimas de una compra,<br>
 *         dando el menor numero de billetes y monedas.<br>
 *         La compra será de un valor de 1.326,24€ y se paga con cuatro billetes
 *         de 500€.<br>
 * 
 */

public class CajaRegistradora1 {

	public static void main(String[] args) {

		/* 	float dineroPagado = 2_000f;
		 	float precio = 1_326.24f;
		 	float cambio;*/

		float dineroPagado = 5_000.5f;
		float precio = 500f;
		float cambio;

		/**
		 * Array {@code float} con tipos de Monedas y Billetes
		 * <ul>
		 * <li>billete 50€</li>
		 * <li>billete 20€</li>
		 * <li>billete 10€</li>
		 * <li>billete 5€</li>
		 * <li>moneda 50€</li>
		 * <li>etc...</li>
		 * </ul>
		 */

		final float[] BILLETES_MONEDAS = { 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
		int vuelta[] = new int[12];

		cambio = dineroPagado - precio;
		float cambio1 = cambio;

		// Calcular el número de billetes de cada tipo a devolver
		
		
		if (cambio < 0) {
			System.out.println("No has pagado lo suficiente.");
			System.out.println("Te falta por pagar " + cambio * -1 + "€");
		} else {
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				if (cambio1 > BILLETES_MONEDAS[i]) {
					int cociente = (int) (cambio1 / BILLETES_MONEDAS[i]);
					vuelta[i] = cociente;
					cambio1 = cambio1 - cociente * BILLETES_MONEDAS[i];
				} else if (cambio1 == BILLETES_MONEDAS[i]) {
					vuelta[i] = 1;
					break;
				} else
					vuelta[i] = 0;
			}
		}

		// Sacar por pantalla los resultados

		if (cambio > 0) {
			System.out.println("Las mejores vueltas de " + cambio + "€ es en:");
			System.out.println();

			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				int miBillete_Monedas = (int) BILLETES_MONEDAS[i];
				if (i >= 0 && i <= 3) {
					System.out.println(vuelta[i] + " Billetes de " + miBillete_Monedas + " Euros");
				} else if (i >= 4 && i <= 5) {
					System.out.println(vuelta[i] + " Monedas de " + miBillete_Monedas + " Euros");
				} else if (i > 5 && i < BILLETES_MONEDAS.length) {
					System.out.println(
							vuelta[i] + " Monedas de " + (int) (BILLETES_MONEDAS[i] * 100) + " céntimos de Euro");
				}

			}
		}

	}

}
