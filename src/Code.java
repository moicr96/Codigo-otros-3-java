//función del código: determinar si es o no afortunado

//se formatea el código
//se añaden comentarios de identificación de llaves
//se cambian los nombres de las variables para que se entienda mejor

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner escaneado = new Scanner(System.in); // Se le agrega el System.in y el import java.util
		System.out.print("Introduzca un número: "); // se cambia comilla simple por doble
		int numIngresado = escaneado.nextInt(); //se cambia el String por int y el nextLine por nextInt
		int c = numIngresado;
		int afortunado = 0;
		int noAfortunado = 0;
		numIngresado %= 10;

		while (numIngresado > 0) { 
			int digito=c;
//			int digito = (int) (numIngresado % 10); //comentamos las partes innecesarias
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afortunado++;
			} else {
				noAfortunado++;				
			}
			numIngresado/= 10;
		}		
			if (afortunado > noAfortunado) {
				System.out.println("El " + c + " es un número afortunado."); //se cambia prinln a println
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}//if 
		escaneado.close(); //se cierra el scanner
	}//main
}//class Code