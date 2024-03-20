package lpa;
import java.util.Scanner;
public class Nowtas {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double nota1,nota2,nota3,nota4,media;

		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextDouble();

		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextDouble();

		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextDouble();

		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextDouble();

		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média das notas é: "+media);

		if (media>=6) {
			System.out.println("Aprovado! EEEEEEEE!");
		}
		else if (media <4) {
			System.out.println("Reprovado... Melhore né");
		}
		else {
			System.out.println("Recuperação!!");
		}
		ler.close();



	}

}
