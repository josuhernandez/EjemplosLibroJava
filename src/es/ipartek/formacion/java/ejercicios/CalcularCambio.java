package es.ipartek.formacion.java.ejercicios;

public class CalcularCambio {
	
	//*************************************************************************************
	//DEFINICIÓN DE VARIABLES
	
	private float dineroPagado;
	private float precio;

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
	
	//*************************************************************************************	
	//CONSTRUCTOR
	public CalcularCambio() {
		
		super();
		this.dineroPagado = 0;
		this.precio = 0;
		this.vuelta = new int[BILLETES_MONEDAS.length];
	}


	//*************************************************************************************	
	//GET and SET

	public float getDineroPagado() {
		return dineroPagado;
	}

	public void setDineroPagado(float dineroPagado) {
		this.dineroPagado = dineroPagado;
	}

	public float getPrecio() {
		return precio;
	}

	public int[] getVuelta() {
		
		return vuelta;
	}


	public void setVuelta(int[] vuelta) {
		this.vuelta = vuelta;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//*************************************************************************************	
	//METODOS
	
	public void calcularVueltasOptimas(){
		
		float cambio = this.dineroPagado - this.precio;
		if (cambio < 0) {
			System.out.println("No has pagado lo suficiente.");
			System.out.println("Te falta por pagar " + cambio * -1 + "€");
		} else {
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				if (cambio > BILLETES_MONEDAS[i]) {
					int cociente = (int) (cambio / BILLETES_MONEDAS[i]);
					vuelta[i] = cociente;
					cambio = cambio - cociente * BILLETES_MONEDAS[i];
				} 
				
				//No es necesario comprobar los siguientes pasos
				/*else if (cambio == BILLETES_MONEDAS[i]) {
					vuelta[i] = 1;
					break;
				} else
					vuelta[i] = 0;*/
			}
		}

	}
	
	public void sacarResultadosPorPantalla(){
		float cambio = this.dineroPagado - this.precio;
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
	
	//*************************************************************************************
	//METODO MAIN
	
	public static void main(String[] args) {
		
		CalcularCambio caja = new CalcularCambio();
		caja.setDineroPagado(2000f);
		caja.setPrecio(1326.24f);
		caja.calcularVueltasOptimas();
		caja.sacarResultadosPorPantalla();
	}
	

}
