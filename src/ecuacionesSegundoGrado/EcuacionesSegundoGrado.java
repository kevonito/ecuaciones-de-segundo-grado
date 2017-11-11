package ecuacionesSegundoGrado;

import java.util.Scanner;

public class EcuacionesSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner sc = new Scanner(System.in);
		float a;
		float b;
		float c;
		double x1;
		double x2;
		System.out.println("Introduzca valor de a");
		a = sc.nextInt();
		while (a == 0) {
			System.out.println("Introdusca un numero diferente de 0");
			a = sc.nextInt();
		}
		System.out.println("Introduzca valor de b");
		b = sc.nextInt();
		System.out.println("Introduzca valor de c");
		c = sc.nextInt();
		double discriminante = (b * b) - (4 * a * c);
		
		x1=(-b + Math.sqrt(discriminante)) / 2 * a;
		
		x2=(-b - Math.sqrt(discriminante)) / 2 * a;
		
		if (discriminante < 0) {
			System.out.println("La ecuacion esta en el rango de los numeros imaginarios");
		}else if (discriminante == 0) {
			System.out.println(x1);
		}else if (discriminante > 0) {
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		

	}

}
