package Lista1;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o cpf: ");
		String cpf = entrada.nextLine();
		System.out.print("Digite o sexo: ");
		String sexo = entrada.nextLine();
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("O aluno %s com cpf %s do sexo %s tem %d anos", nome, cpf, sexo, idade);
		entrada.close();
	}
}
