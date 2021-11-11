package Lista2;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota >= 8.5)
			System.out.println("A");
		else if(nota >= 7 && nota < 8.5)
			System.out.println("B");
		else if(nota >= 5 && nota < 7)
			System.out.println("C");
		else if(nota >= 3 && nota < 5)
			System.out.println("D");
		else if(nota < 3)
			System.out.println("E");
		
		entrada.close();
	}

}
