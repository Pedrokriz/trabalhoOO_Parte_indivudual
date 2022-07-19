package javaapplication43;

import Excessoes.InvalidInputException;
import java.util.Scanner;

public class MainTest {
	public static void main(String [] args) {
                Scanner teclado = new Scanner(System.in);
                String nome = teclado.next();
                int matricula = teclado.nextInt();
                float nota = teclado.nextFloat();
		AvaliacaoOO2022 avaliacao = new AvaliacaoOO2022(nome, matricula, nota);
		Airline airline = new Airline(avaliacao);
		Main.readInputFile("C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication43\\src\\javaapplication43\\TxtTest.txt", airline);
		
		
		Airline airline2 = new Airline(avaliacao);
		try {
			System.out.println("Voo Comercial 100000003 tem um payload de 0 = ");
			System.out.println(airline2.addFlight('C'));
			System.out.println("Voo Industrial 200000004 tem um payload de 0 = ");
			System.out.println(airline2.addFlight('I'));
		} catch (InvalidInputException e) {
			System.out.println("Não roda!");
		}
		
		System.out.println(airline2.getFlight(100000003));
		
		//nulo:
		System.out.println(airline2.getFlight(100000000));
		System.out.println("Voo Comercial 100000000 tem um payload de 0 = ");
		System.out.println(airline.getFlight(100000000));
		
	}

}
