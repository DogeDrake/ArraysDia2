
//Ejercicios hemos en conjunto por Luis Gonzales, Guillermo Vallejo y Martin Cardoan

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort = true;
// Implementa una forma de saber si el array est� ordenado o n
		for (int i = 0; i < listado1.length - 1; i++)
			if (listado1[i] > listado1[i + 1]) {
				isSort = false;
			}
// Almacena el resultado en la variable isSort

		if (isSort)
			System.out.println("El vector est� ordenado");
		else
			System.out.println("El vector NO est� ordenado");
	}
}