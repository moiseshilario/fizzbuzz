package br.inf.ufg.fizzbuzz;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for Fizzbuzz.
 */
public class TestFizzBuzz

{
	@Test
	public void cpuDeveResponderFizzBuzz() {
		Computador cpu = new Computador();
		int numDaVez = 15;
		
		Assert.assertEquals("fizzbuzz", cpu.jogar(numDaVez));
	}
	
	@Test
	public void cpuDeveResponderFizz() {
		Computador cpu = new Computador();
		int num1 = 3;
		int num2 = 6;
		
		Assert.assertEquals("fizz", cpu.jogar(num1));
		Assert.assertEquals("fizz", cpu.jogar(num2));
	}
	
	@Test
	public void cpuDeveResponderBuzz() {
		Computador cpu = new Computador();
		int num1 = 5;
		int num2 = 20;
		
		Assert.assertEquals("buzz", cpu.jogar(num1));
		Assert.assertEquals("buzz", cpu.jogar(num2));
	}
	
	@Test
	public void cpuDeveResponderNumero() {
		Computador cpu = new Computador();
		int num1 = 4;
		int num2 = 26;
		
		Assert.assertEquals("" + num1, cpu.jogar(num1));
		Assert.assertEquals("" + num2, cpu.jogar(num2));
	}
	
	@Test
	public void deveChecarJogadaCorreta() {
		Jogo jogo = new Jogo();
		String jogada1 = "fizz";
		String jogada2 = "buzz";
		String jogada3 = "fizzbuzz";
		String jogada4 = "4";
		int num1 = 3;
		int num2 = 5;
		int num3 = 15;
		int num4 = 4;
		
		Assert.assertTrue(jogo.checarJogada(jogada1, num1));
		Assert.assertTrue(jogo.checarJogada(jogada2, num2));
		Assert.assertTrue(jogo.checarJogada(jogada3, num3));
		Assert.assertTrue(jogo.checarJogada(jogada4, num4));
	}
	
	@Test
	public void deveChecarJogadaErrada() {
		Jogo jogo = new Jogo();
		String jogada1 = "3";
		String jogada2 = "5";
		String jogada3 = "15";
		String jogada4 = "5";
		String jogada5 = "fizz";
		int num1 = 3;
		int num2 = 5;
		int num3 = 15;
		int num4 = 4;
		int num5 = 7;
		
		Assert.assertFalse(jogo.checarJogada(jogada1, num1));
		Assert.assertFalse(jogo.checarJogada(jogada2, num2));
		Assert.assertFalse(jogo.checarJogada(jogada3, num3));
		Assert.assertFalse(jogo.checarJogada(jogada4, num4));
		Assert.assertFalse(jogo.checarJogada(jogada5, num5));	
	}
	
	@Test
	public void deveChecarJogador() {
		String data = "1\n";		
		Jogador jogador = new Jogador(new ByteArrayInputStream(data.getBytes()));
		jogador.jogar();
		Assert.assertNotNull(null, jogador);
	}
	
	@Test
	public void deveChecarVezDoJogador() {
		Jogo jogo = new Jogo();
		String data = "1\n";	
		Jogador jogador = new Jogador(new ByteArrayInputStream(data.getBytes()));
		Jogador jogador2 = new Jogador(new ByteArrayInputStream(data.getBytes()));
		int num = 3;
		int num2 = 1;
		
		Assert.assertTrue(jogo.jogadorErrou(jogador,num));
		Assert.assertFalse(jogo.jogadorErrou(jogador2,num2));
	}
	
}
