package Lista1;
import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° salário: ");
		double salario1 = entrada.nextDouble();
		System.out.print("Digite o 2° salário: ");
		double salario2 = entrada.nextDouble();
		System.out.print("Digite o 3° salário: ");
		double salario3 = entrada.nextDouble();
		double media = (salario1+salario2+salario3)/3;
		
		System.out.printf("O salario médio da empresa é %.2f", media);
		entrada.close();
	}
}
