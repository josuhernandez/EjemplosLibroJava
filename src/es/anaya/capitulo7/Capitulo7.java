package es.anaya.capitulo7;


//es una clase main que instancia dos objetos del tipo Libro
public class Capitulo7 {

	public static void main(String[] args) {
		
		//creamos un nuevo objeto libroC que es de la clase Libro
		
		Libro libroC = new Libro();
		libroC.titulo = new char[] {'C', '+', '+'};
		libroC.numeroPaginas = 300;
		libroC.dimensionAlto = 50.0f;
		libroC.dimensionAncho = 50.0f;
		libroC.autor = new char[] {'J', 'U','L', 'I', 'O'};
		libroC.anioEdicion =2010;
		libroC.contenidoLibro ="bla,bla,bla,....";
		
		Libro libroJava7 = new Libro();
		libroJava7.titulo = new char[] {'J', 'A', 'V', 'A',' ', '7'};
		libroJava7.numeroPaginas = 350;
		libroJava7.dimensionAlto = 60.0f;
		libroJava7.dimensionAncho = 60.0f;
		libroJava7.autor = new char[] {'M', 'O','N', 'T','E','R', 'O'};
		libroJava7.anioEdicion =2011;
		libroJava7.contenidoLibro ="bla,bla,bla,....";
		
		//sacamos por pantalla los datos de los dos libros
		System.out.println(libroC);
		System.out.println(libroJava7);
	}

}
