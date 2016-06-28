package es.ipartek.formacion.java.ejercicios;

public class CalcularCambio {
	
	
	private float dineroPagado;
	private float precio;
	private float cambio;
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
	
	
	//CONSTRUCTOR
	public CalcularCambio(float dineroPagado, float precio) {
		
		super();
		this.dineroPagado = dineroPagado;
		this.precio = precio;
		this.cambio = dineroPagado - precio;
	}

	
	public float getCambio() {
		return cambio;
	}


	public void setCambio(float cambio) {
		this.cambio = cambio;
	}


	public float getDineroPagado() {
		return dineroPagado;
	}

	public void setDineroPagado(float dineroPagado) {
		this.dineroPagado = dineroPagado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	public void calcularVueltasOptimas(){
		
		if (this.cambio < 0) {
			System.out.println("No has pagado lo suficiente.");
			System.out.println("Te falta por pagar " + cambio * -1 + "€");
		} else {
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				if (this.cambio > BILLETES_MONEDAS[i]) {
					int cociente = (int) (this.cambio / BILLETES_MONEDAS[i]);
					vuelta[i] = cociente;
					this.cambio = this.cambio - cociente * BILLETES_MONEDAS[i];
				} else if (this.cambio == BILLETES_MONEDAS[i]) {
					vuelta[i] = 1;
					break;
				} else
					vuelta[i] = 0;
			}
		}
		System.out.println(vuelta);
		//return vuelta;
	}
	
	public void sacarResultadosPorPantalla(){
		if (this.cambio > 0) {
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
