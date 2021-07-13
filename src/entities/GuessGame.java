package entities;

import java.util.Scanner;

public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		
		int p1guess = 0;
		int p2guess = 0;
		int p3guess = 0;
		
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
		
		int targetNumber = (int)(Math.random() * 10);
		
		while(true) {
			System.out.println("------------ Jogo da Advinhação --------------");
			System.out.println("Estou pensando em um número entre 0 e 9 ....");
			System.out.println("Tentem adivinhar!");
			
			System.out.print("Jogador 1 digite um numero: ");
			p1guess = sc.nextInt();
			p1 = new Player(p1guess);
			System.out.print("Jogador 2 digite um numero: ");
			p2guess = sc.nextInt();
			p2 = new Player(p2guess);
			System.out.print("Jogador 3 digite um numero: ");
			p3guess = sc.nextInt();
			p3 = new Player(p3guess);
			
			System.out.println("O jogador um forneceu o palpite " + p1.getNumber());
			System.out.println("O jogador dois forneceu o palpite " + p2.getNumber());
			System.out.println("O jogador três forneceu o palpite " + p3.getNumber());
			
			if (p1.getNumber() == targetNumber) {
				p1IsRight = true;
			}
			if (p2.getNumber() == targetNumber) {
				p2IsRight = true;
			}
			if (p3.getNumber() == targetNumber) {
				p3IsRight = true;
			}
			
			if (p1IsRight || p2IsRight || p3IsRight) {
				System.out.println("Temos um vencedor!");
				System.out.println("Numero a adivinhar: " + targetNumber);
				System.out.println("O jogador um acertou? " + p1IsRight);
				System.out.println("O jogador dois acertou? " + p2IsRight);
				System.out.println("O jogador três acertou? " + p3IsRight);
				System.out.println("Fim do jogo!");
				break;
			}else {
				System.out.println("Os jogadores terão que tentar novamente, pois ninguém acertou!");
				System.out.println();
			}
			
		}
		sc.close();
	}

}
