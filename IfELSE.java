package lpa;
import java.util.Scanner;
public class IfELSE {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int numero;

		System.out.println("Informe o número desejado: ");
		numero = ler.nextInt();

		if (numero >0) {
			System.out.println("O número é positivo!");
		}

		else if (numero == 0) {
			System.out.println("O número é igual a zero");
		}

		else {
			System.out.println("O número é negativo..");
		}
		ler.close();
	}

}