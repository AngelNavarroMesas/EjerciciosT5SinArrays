package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[8];
		
		for(int i=0;i<num.length;i++) {
			
			System.out.println("Introduzca un numero");
			num[i] = sc.nextInt();
		}
		for(int i : num) {
			if(i%2==0) {
				System.out.println(i+" Par");
			}else if(i%2!=0) {
				System.out.println(i+" Impar");
			}
		}
		
	}

}
