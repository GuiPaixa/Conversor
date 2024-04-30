package main;

import java.util.Locale;
import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String temperatura;
		Double temperaturaInicial;
		boolean continuar;

		do {
			System.out.println("Qual temperatura você quer converter para Celcius, (K) para Kelvin ou (F) para Fahrenheit? ");
			temperatura = input.next().toUpperCase();
			System.out.println("Digite a temperatura inicial: ");
			temperaturaInicial = input.nextDouble();
			System.out.println("Resultado: " + conversor(temperatura, temperaturaInicial));
			continuar = verificarNovaOperacao();

		} while (continuar);
	}

	public static Double conversor(String temperatura, Double temperaturaInicial) {

		switch (temperatura) {
		case "K":
			temperaturaInicial = temperaturaInicial - 273.15;
			break;
		case "F":
			temperaturaInicial = (temperaturaInicial - 32) / 1.8;
			break;
		default:
			System.out.println("Operação inválida! ");
			break;

		}
		return temperaturaInicial;

	}

	public static boolean verificarNovaOperacao() {
		Scanner input = new Scanner(System.in);
		System.out.println("Deseja realizar uma nova operação (S / N)?");
		return !input.nextLine().toUpperCase(Locale.ROOT).equals("N");

	}
}