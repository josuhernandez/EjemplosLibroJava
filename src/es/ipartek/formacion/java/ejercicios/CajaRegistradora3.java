package es.ipartek.formacion.java.ejercicios;

/**
 * 
 * @author JosuHernandez <br>
 *         Clase ejecutable que calcula las vueltas optimas de una compra,<br>
 *         dando el menor numero de billetes y monedas.<br>
 * 
 */

public class CajaRegistradora3 {

	// Declaracion variables
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
	
	private float precio;
	private float dineroPagado;
	int[] vuelta;
	public static final float[] BILLETES_MONEDAS = { 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
	//float cambio;
	//float miCambio;
	
	//CONSTRUCTOR
	public CajaRegistradora3(float precio, float dineroPagado) {
		super();
		this.precio = precio;
		this.dineroPagado = dineroPagado;
		this.vuelta = new int[BILLETES_MONEDAS.length];
	}

	// CREACIÓN DE METODOS
	/**
	 * Método que devuelve la diferencia entre el dinero pagado y el precio del
	 * producto.<br>
	 * 
	 * @param dineroPagado {@code float} dinero que pagamos en €.<br>
	 * @param precio {@code float} dinero que cuesta el producto en €.<br>
	 * @return cambio {@code float} la diferencia entre el dinero pagado y el precio del producto
	 */

	public static float calcularVueltas(float dineroPagado, float precio) {

		float cambio = dineroPagado - precio;
		return cambio;
	}

	// Metodo para Calcular el número de billetes de cada tipo a devolver
	/**
	 * 
	 * @param cambio {@code float} la diferencia entre el dinero pagado y el precio del producto
	 * @return vueltas {@code int[]}  contiene el número de billetes/monedas de cada tipo
	 * 	<ul>		
	 * 	<li>vueltas[0]= nº de billetes de 50€</li>
	 * 	<li>vueltas[1]= nº de billetes de 20€</li>
	 * 	<li>vueltas[2]= nº de billetes de 10€</li>
	 *  <li>vueltas[3]= nº de billetes de 5€</li>
	 *  <li>vueltas[4]= nº de billetes de 2€</li>
	 *  <li>vueltas[5]= nº de monedas de 1€</li>
	 *  <li>vueltas[6]= nº de monedas de 0,50€</li>
	 *  <li>vueltas[7]= nº de monedas de 0,20€</li>
	 *  <li>vueltas[8]= nº de monedas de 0,10€</li>
	 *  <li>vueltas[9]= nº de monedas de 0,05€</li>
	 *  <li>vueltas[10]= nº de monedas de 0,02€</li>
	 *  <li>vueltas[11]= nº de monedas de 0,01€</li>
	 * 
	 * 
	 * 	</ul>
	 */
	private static int[] calcularVueltasOptimas(float cambio) {


		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			if (cambio > BILLETES_MONEDAS[i]) {
				int cociente = (int) (cambio / BILLETES_MONEDAS[i]);
				this.vuelta[i] = cociente;
				this.cambio = this.cambio - cociente * BILLETES_MONEDAS[i];
			} else if (this.cambio == BILLETES_MONEDAS[i]) {
				vueltas[i] = 1;
				break;
			} else
				vueltas[i] = 0;
		}
		return vueltas;

	}

	// METODO MAIN
	public static void main(String[] args) {

		float miCambio = calcularVueltas(50.5f, 500f);

		if (miCambio < 0) {
			System.out.println("No has pagado lo suficiente.");
			System.out.println("Te falta por pagar " + miCambio * -1 + "€");
		} else if (miCambio > 0) {
			System.out.println("Las mejores vueltas de " + miCambio + "€ es en:");
			System.out.println();
		
			int misVueltas[] = calcularVueltasOptimas(miCambio);

			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				int miBillete_Monedas = (int) BILLETES_MONEDAS[i];
				if (i >= 0 && i <= 3) {
					System.out.println(misVueltas[i] + " Billetes de " + miBillete_Monedas + " Euros");
				} else if (i >= 4 && i <= 5) {
					System.out.println(misVueltas[i] + " Monedas de " + miBillete_Monedas + " Euros");
				} else if (i > 5 && i < BILLETES_MONEDAS.length) {
					System.out.println(
							misVueltas[i] + " Monedas de " + (int) (BILLETES_MONEDAS[i] * 100) + " céntimos de Euro");
				}

			}
		}

	}

}
