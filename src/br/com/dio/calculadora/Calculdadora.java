package br.com.dio.calculadora;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculdadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a, b;

		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		double soma = soma(a, b);
		double subtracao = subtracao(a, b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);

		System.out.println("Resultado da soma: " + NumberFormat.getCurrencyInstance().format(soma));
		System.out.println("Resultado da subtração: " + NumberFormat.getCurrencyInstance().format(subtracao));
		System.out.println("Resultado da divisao: " + NumberFormat.getCurrencyInstance().format(divisao));
		System.out.println("Resultado da multiplicacao: " + NumberFormat.getCurrencyInstance().format(multiplicacao));
	}

	public static double soma(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

}
