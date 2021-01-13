package com.curso;

import java.util.Date;
import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de seu nascimento: ");
        int nasc = teclado.nextInt();
        Date dataAtual = new Date();
        int i = (dataAtual.getYear() + 1900) - nasc; //depreciado da lib, mas ele nao pega o ano e sim a subtracao do ano atual até 1900
        System.out.println("Sua idade é: " + i);
        if (i >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
