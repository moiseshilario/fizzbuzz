package br.inf.ufg.fizzbuzz;

public class Computador {
	
	public String jogar(int num) {
		String jogada = "";
		if(num % 15 == 0) {
			jogada = "fizzbuzz";
		} else if(num % 3 == 0) {
			jogada = "fizz";
		} else if(num % 5 == 0) {
			jogada = "buzz";
		} else jogada = String.valueOf(num);
		return jogada;
	}
}
