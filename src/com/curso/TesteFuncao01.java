package com.curso;

public class TesteFuncao01 {

    static void soma1(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
    static int soma2(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        soma1(5,2);
        int sm = soma2(5,2);
        System.out.println("A soma com funcao vale: " + sm);
    }
}
