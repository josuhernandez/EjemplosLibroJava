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

public class CajaRegistradora2 {

	public static void main(String[] args) {
	
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

		//final float[] BILLETES_MONEDAS = { 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
		
		CalcularCambio calculo1=new CalcularCambio(2000.5f, 1390.3f);
		System.out.println(calculo1);
		//sacarResultadosPorPantalla(calculo);

	}

}
