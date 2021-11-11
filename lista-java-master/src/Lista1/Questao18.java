package Lista1;
import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s no grupo de risco", idade > 40 ? "Está" : "Não está");
		entrada.close();
	}

}
