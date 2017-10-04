package br.inf.ufg.fizzbuzz;

public class Jogo {

	public boolean checarJogada(String jogada, int numDaVez) {
		if (numDaVez % 3 == 0 && numDaVez % 5 == 0) {
			return jogada.equals("fizzbuzz") ? true : false;
		} else if (numDaVez % 3 == 0) {
			return jogada.equals("fizz") ? true : false;
		} else if (numDaVez % 5 == 0) {
			return jogada.equals("buzz") ? true : false;
		} else if (isNumber(jogada))
			return Integer.parseInt(jogada) == numDaVez ? true : false;
		else
			return false;
	}

	public static boolean isNumber(String text) {
		try {
			new Integer(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean jogadorErrou(Jogador jogador, int num) {
		System.out.print("Jogador: ");
		String jogada = jogador.jogar();
		if (!checarJogada(jogada, num)) {
			System.out.println("Voce errou!");
			return true;
		}
		return false;
	}
}
