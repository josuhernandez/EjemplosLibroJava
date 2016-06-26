package es.anaya.capitulo7;

public class EjemploRecibirParametros {
	
	//metodo que no recibe parámetros ()  y que no devuelve nada (void)
	public void metodoSinParametros(){
		System.out.println("Método sin parámetros");
	}
	
	//metodo que recibe 2 parámetros (operando1 y operando2)  y que no devuelve nada (void)	
	public void doSuma (int operando1, int operando2){
		int resultadoSuma = operando1 + operando2;
		System.out.println("El resultado de sumar " + operando1 + " + " + operando2 + " es " + resultadoSuma);
	}
	
		void doResta (int operando1, int operando2){
		int resultadoResta = operando1 - operando2;
		System.out.println("El resultado de restar " + operando1 + " - " + operando2 + " es " + resultadoResta);
	}
		
	//metodo que recibe dos parametros (operando1 y operando2)  y que devuelve un entero
		//los metodos que devuelven datos solo pueden devolver UN SOLO DATO
	public int doMultiplicacion (int operando1, int operando2){
		int resultadomultiplicacion= operando1 * operando2;
		return resultadomultiplicacion;
	}
}
