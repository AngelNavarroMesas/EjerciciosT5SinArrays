package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int aux=num.length-1;
		
		for(int i=0 ;i<num.length;i++) {
			
			System.out.println("Introduzca un numero");
			num[aux] = sc.nextInt();
			aux--;
			
		}
		System.out.println();
		
		for(int i: num) {
			System.out.print(i+", ");
		}
		sc.close();
	}

}
