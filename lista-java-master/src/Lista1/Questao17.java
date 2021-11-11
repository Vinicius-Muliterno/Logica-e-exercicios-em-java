package Lista1;
import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a temperatura do Dia 1: ");
		int temperatura1 = entrada.nextInt(); 
		System.out.print("Digite a temperatura do Dia 2: ");
		int temperatura2 = entrada.nextInt(); 
		
		if(temperatura1 < 20 && temperatura2 > 20)
			System.out.print("Não vai chover");
		else
			System.out.print("Vai chover");
		
		entrada.close();
	}

}
