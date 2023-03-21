package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println(gato);
		System.out.println(livros);

		/*
		 * int a = 2; int b = 3; if( a > 1) { System.out.println("Hello World " +
		 * (a+b)); } else { System.out.println("Hello World"); }
		 */
	}
}

class Livros {
	private String nome;
	private String npag;
}