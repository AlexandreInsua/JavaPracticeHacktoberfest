package com.hacktoberfest;

public class tempexec {

	public static void main(String[] args) {

		long tiempoInicio = System.currentTimeMillis();

		ejecutaProceso1();
		// Aqui llama al m�todo que quiere calcular el tiempo de ejecuci�n

		long totalTiempo = System.currentTimeMillis() - tiempoInicio;
		System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");
	}

	static void ejecutaProceso1() {
		// en i < 1000 se le puede colocar un valor mayor
		for (int i = 0; i < 10000; i++) {

			String cad = " Esto es ";
			cad += " una ";
			cad += " prueba ";
			System.out.println(" " + cad); // es por si se quiere imprimir lo
											// que hay pero no es necesario
		}
	}
}
