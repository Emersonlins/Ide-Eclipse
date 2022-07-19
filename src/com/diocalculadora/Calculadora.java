package com.diocalculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = 	new Scanner(System.in);
		
		int a, b;
		System.out.println("Digitei o primeiro valor:  ");
		a = scan.nextInt();
		System.out.println("Digitei o seguntdo valor:  ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma " + soma);
		System.out.println("Sub " + subtracao);
		System.out.println("Div " + divisao);
		System.out.println("Mult " + multiplicacao);
	}
    public static int soma(int a, int b) {
    	return a + b;
    }
    public static int subtracao(int a, int b) {
    	return a - b;
    }
    public static int divisao(int a, int b) {
    	return a / b;
    }
    public static int multiplicacao(int a, int b) {
    	return a * b;
    }
}
