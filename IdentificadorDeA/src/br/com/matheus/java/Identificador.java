package br.com.matheus.java;

public class Identificador {
	private String entrada;

    public Identificador(String entrada) {
        this.entrada = entrada;
    }

    public boolean existeLetraA() {
        String entradaMinuscula = entrada.toLowerCase();
        for (int i = 0; i < entradaMinuscula.length(); i++) {
            if (entradaMinuscula.charAt(i) == 'a') {
                return true;
            }
        }
        return false;
    }

    public int quantidadeLetraA() {
        String entradaMinuscula = entrada.toLowerCase();
        int quantidadeA = 0;
        for (int i = 0; i < entradaMinuscula.length(); i++) {
            if (entradaMinuscula.charAt(i) == 'a') {
                quantidadeA++;
            }
        }
        return quantidadeA;
    }
}
