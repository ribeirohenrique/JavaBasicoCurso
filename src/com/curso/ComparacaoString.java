package com.curso;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Henrique";
        String nome2 = "Henrique";
        String nome3 = new String("Henrique");
        String res1;
        res1 = (nome1==nome3)?"igual":"diferente";
        System.out.println(res1);

        String nome4 = "Henrique1";
        String nome5 = "Henrique1";
        String nome6 = new String("Henrique1");
        String res2;
        res2 = (nome4.equals(nome6))?"igual":"diferente";
        System.out.println(res2);
    }
}
