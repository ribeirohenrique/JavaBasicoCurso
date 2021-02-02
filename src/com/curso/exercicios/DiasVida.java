package com.curso.exercicios;

import java.util.Date;
import java.util.Scanner;

public class DiasVida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Date data = new Date(); //instaciado a classe Date na variavel data
        System.out.print("Digite o ano de Nascimento: ");
        int anoNasc = teclado.nextInt();
        System.out.print("Digite o mes de Nascimento: ");
        int mesNasc = teclado.nextInt();
        System.out.print("Digite o dia de Nascimento: ");
        int diaNasc = teclado.nextInt();
        int idade = (data.getYear() + 1900) - anoNasc;
        int diasVida = (idade * 365) + (mesNasc * 30) - diaNasc;
        System.out.println("Você tem: " + idade + " Anos e já viveu: " + diasVida + " dias");

    }
}
