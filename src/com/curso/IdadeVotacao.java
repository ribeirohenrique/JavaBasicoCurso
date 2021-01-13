package com.curso;

import java.util.Date;
import java.util.Scanner;

public class IdadeVotacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nasc = teclado.nextInt();
        Date dataNascimento = new Date();
        int i = (dataNascimento.getYear() + 1900) - nasc;
        if (i < 16){
            System.out.println("Não vota");
        } else if ((i >=16 && i <18) || (i>70)){
            System.out.println("Opcional");
        } else {
            System.out.println("Obrigatorio");
        }
    }
}
