package br.com.teste;

import java.util.Scanner;

public class TheTrip {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
			String linha;

			while (scr.hasNextLine()) {
				linha = scr.nextLine();
				boolean inicio = true;

				while (linha.contains("_") || linha.contains("*")) {
					if (linha.contains("_") && inicio) {
						linha = linha.replaceFirst("_", "<i>");
						inicio = false;
					} else if (linha.contains("_") && !inicio) {
						linha = linha.replaceFirst("_", "</i>");
						inicio = true;
					} else if (linha.contains("*") && inicio) {
						linha = linha.replaceFirst("\\*", "<b>");
						inicio = false;
					} else if (linha.contains("*") && !inicio) {
						linha = linha.replaceFirst("\\*", "</b>");
						inicio = true;
					}
				}
				System.out.println(linha);
			}
		}
	}
}
