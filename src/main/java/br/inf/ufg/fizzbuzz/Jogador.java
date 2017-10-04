package br.inf.ufg.fizzbuzz;

import java.io.InputStream;
import java.util.Scanner;

public class Jogador {
	Scanner sc;
	
	public Jogador(InputStream in) {
		System.setIn(in);
		sc = new Scanner(System.in);
	}
	
	public String jogar() {
		String jogada = sc.nextLine();
		return jogada;
	}
}
