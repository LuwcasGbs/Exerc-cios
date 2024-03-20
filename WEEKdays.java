package lpa;
import java.util.Scanner;
public class WEEKdays {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String dia;
		
		System.out.println("Insira o dia da semana: ");
		dia = ler.next();
		
		if (dia.toLowerCase().equals("domingo")) {
			System.out.println("O dia selecionado é 1");
		}
		else if (dia.toLowerCase().equals("segunda")) {
			System.out.println("O dia selecionado é 2");
		}
		else if (dia.toLowerCase().equals("terça")) {
			System.out.println("O dia selecionado é 3");
		}
		else if (dia.toLowerCase().equals("quarta")) {
			System.out.println("O dia selecionado é 4");
		}
		else if (dia.toLowerCase().equals("quinta")) {
			System.out.println("O dia selecionado é 5");
		}
		else if (dia.toLowerCase().equals("sexta")) {
			System.out.println("O dia selecionado é 6");
		}
		else if (dia.toLowerCase().equals("sabado")) {
			System.out.println("O dia selecionado é 7");
		}
		else {
			System.out.println("Dia inválido");
		}
		ler.close();
	}
		

}
