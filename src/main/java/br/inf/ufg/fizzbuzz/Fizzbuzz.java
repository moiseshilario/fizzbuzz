package br.inf.ufg.fizzbuzz;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Fizzbuzz {
	public static void main(String[] args) {
		Random gerador = new Random();
		boolean jogadorDaVez = gerador.nextBoolean();
		Computador cpu = new Computador();
		boolean errou = false;
		Jogo jogo = new Jogo();
		int num = 1;
		
		System.out.println("===== Fizz buzz =======");
		
		while(!errou) {
			Jogador player = new Jogador(System.in);
			if (jogadorDaVez) {
				if (!jogo.jogadorErrou(player, num)) {
					num++;
				} else
					errou = true;
			} else {
				System.out.println("Computador: " + cpu.jogar(num));
				num++;
			}
			jogadorDaVez = !jogadorDaVez;
		}
		
		System.out.println("Fim do jogo!");
	}
}
