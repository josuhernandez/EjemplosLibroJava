package es.anaya.capitulo7;

public class EjemploRecibirParametrosMain {

	public static void main(String[] args) {
		EjemploRecibirParametros claseEjemplo = new EjemploRecibirParametros();
		
		int operando1 = 20;
		int operando2 = 10;
		claseEjemplo.doSuma(operando1, operando2);
		claseEjemplo.doResta(operando1, operando2);
		int multiplicacion= claseEjemplo.doMultiplicacion(operando1,operando2);
		System.out.println(multiplicacion);
		System.out.println("intro  numero");
		
		
		
	}

}
