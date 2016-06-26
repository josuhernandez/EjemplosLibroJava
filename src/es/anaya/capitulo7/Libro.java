package es.anaya.capitulo7;

import java.util.Arrays;

public class Libro {
	
	//Declaraci�n de variables
	char [] titulo;   //crea una matriz cuyos elementos van a ser caracteres (tipo char)
	int numeroPaginas;
	float dimensionAlto;
	float dimensionAncho;
	char[] autor;
	int anioEdicion;
	String contenidoLibro;
	
	//Creaci�n de M�todos
	
		//metodo al que se accede sin parametros y devuelve el contenidoLibro
	public String leer(){     
		return contenidoLibro;
	}
		
		//m�todo que no devuelve nada (void) y al que se accede con un parametro nuevoContenido
	public void escribir(String nuevoContenido){   
		this.contenidoLibro = nuevoContenido;
	}
	
		//M�todo toString para que me imprima en pantalla todos los datos del libro
	@Override
	public String toString() {
		return "Libro [titulo=" + Arrays.toString(titulo) + ", numeroPaginas=" + numeroPaginas + ", dimensionAlto="
				+ dimensionAlto + ", dimensionAncho=" + dimensionAncho + ", autor=" + Arrays.toString(autor)
				+ ", anioEdicion=" + anioEdicion + ", contenidoLibro=" + contenidoLibro + "]";
	}
	

}
