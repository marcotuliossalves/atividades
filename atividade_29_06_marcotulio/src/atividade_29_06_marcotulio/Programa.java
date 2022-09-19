package atividade_29_06_marcotulio;

import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Carro [] carros = new Carro [10];
        
        for(int i = 0; i < 10; i++) {
        	
	        System.out.println("Insira o c�digo do " + i + "� carro: ");
			long codigo = teclado.nextLong();
			
			System.out.println("O " + i + "� carro est� acelerado?: ");
			boolean acelerar = teclado.nextBoolean();
			
			System.out.println("Insira a velocidade m�xima do " + i + "� carro: ");
			float velocidadeMax = teclado.nextFloat();
			
			System.out.println("Insira a velocidade atual do " + i + "� carro: ");
			float velocidadeAtual = teclado.nextFloat();
			
			System.out.println("O freio do " + i + "� carro foi acionado? ");
			boolean freioAcionado = teclado.nextBoolean();
			
			System.out.println("O " + i + "� carro est� estercado?: ");
			boolean estecar = teclado.nextBoolean();
			
			System.out.println("Insira o �ngulo do volante do " + i + "� carro: ");
			float anguloVolante = teclado.nextFloat();
			
			carros[i] = new Carro(codigo, acelerar, freioAcionado, estecar, anguloVolante, velocidadeAtual, velocidadeMax);
        }
        
        teclado.close();
        
        carros[0].imprimir();
        carros[1].imprimir();
		
	}
}
