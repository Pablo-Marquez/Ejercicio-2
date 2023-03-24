package Evaluacion2;

//Comentario en nueva rama
/**
 * @since 24/03/2023
 * @author Pablo Marquez Valiente
 * @version 24/03/2023
 * @category Examen
 * {@link https://github.com/Pablo-Marquez/Ejercicio-2.git} 
 */
public class TablaEnteros {
	
	private Integer[] tabla;

	TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	// devuelve la suma de los elementos de la tabla
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}

	// devuelve el mayor elemento de la tabla
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}

	// devuelve la posici�n de un elemento cuyo valor se pasa
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}//
