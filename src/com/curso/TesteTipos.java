package com.curso;

public class TesteTipos {
    public static void main(String[] args) {
        int idade1 = 30;
        String valor1 = Integer.toString(idade1);
        System.out.print("valor com toString: " + valor1 + "\n");
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.printf("Valor com parseInt: " + idade2 + "\n");
    }
}
