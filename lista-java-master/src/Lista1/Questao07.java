package Lista1;
import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o sexo: ");
		String sexo = entrada.nextLine();
		System.out.print("Digite o estado civil: ");
		String estadoCivil = entrada.nextLine();
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt();
		System.out.print("Digite o salario: ");
		double salario = entrada.nextDouble();
		
		System.out.printf("Funcionário %s do sexo %s idade %d e estado civil %s recebe %.2f de salario", nome, sexo, idade, estadoCivil, salario);
		entrada.close();
	}
}
