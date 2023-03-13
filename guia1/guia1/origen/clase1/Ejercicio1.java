package clase1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numeroInicio = 7;
		int numeroFin =10;
		// Se deberían mostrar los números:
		// 5,6,7,8,9,10,11,12,13,14

		while (numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
		System.out.println("termina punto A");
		System.out.println("numero inicio vale:" + numeroInicio);
		System.out.println("numero Fin vale:" + numeroFin);

		System.out.println("iniciamos punto B");

		numeroInicio = 5;
		numeroFin = 14;

		while (numeroInicio <= numeroFin) {

			if (numeroInicio % 2 == 0) {

				System.out.println(numeroInicio);

			}
			numeroInicio++;

		}
		System.out.println("termina punto B");
		System.out.println("numero inicio vale:" + numeroInicio);
		System.out.println("numero Fin vale:" + numeroFin);

		System.out.println("iniciamos punto C");

		numeroInicio = 5;
		numeroFin = 14;

		boolean esPar = true; // si el boolean es true imprime los pares y si es false imprime los impares
		while (numeroInicio <= numeroFin) {

			if (numeroInicio % 2 == 0 && esPar) {

				System.out.println(numeroInicio);
			}
			if (numeroInicio % 2 != 0 && !esPar) {
				System.out.println(numeroInicio);
			}

			numeroInicio++;
		}
		System.out.println("termina punto C");
		System.out.println("numero inicio vale:" + numeroInicio);
		System.out.println("numero Fin vale:" + numeroFin);

		System.out.println("iniciamos punto D");

		numeroInicio = 14;
		numeroFin = 5;
		for (numeroInicio = 14; numeroInicio >= numeroFin; numeroInicio--) {
			if (numeroInicio % 2 == 0)
			{
				System.out.println(numeroInicio);
			}
		}
	}
}
