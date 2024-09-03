package br.com.matheus.main;

import java.util.Scanner;

import br.com.matheus.java.Identificador;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite uma palavra:");
	        String entrada = scanner.nextLine();

	        Identificador analyzer = new Identificador(entrada);

	        if (analyzer.existeLetraA()) {
	            System.out.println("A letra 'a' existe na string.");
	            System.out.println("Quantidade de ocorrências: " + analyzer.quantidadeLetraA());
	        } else {
	            System.out.println("A letra 'a' não existe na string.");
	        }
	    }

	}
