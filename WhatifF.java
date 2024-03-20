package lpa;
import java.util.Scanner;
public class WhatifF {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("Informe o número desejado: ");
		numero = ler.nextInt();
		
		if (numero >10) {
			System.out.println("O número escolhido é maior que 10!");;
		}
		ler.close();
	}

}
