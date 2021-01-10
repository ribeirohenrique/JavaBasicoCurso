package com.curso;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media e igual a: " + m);

        int numero1  = 5;
        numero1++;
        System.out.println("Pós incremento 1: " + numero1);

        int numero2  = 5;
        int valor2 = 5 + numero2++; //incrementa só depois
        System.out.println("Pós incremento 2: " + valor2);

        int numero3  = 5;
        int valor3 = 5 + ++numero3; //incrementa antes
        System.out.println("Pós incremento 3: " + valor3);

        int numero4  = 5;
        numero4--;
        System.out.println("Pós decremento 1: " + numero4);

        int numero5  = 5;
        int valor5 = 5 + numero5--; //incrementa só depois
        System.out.println("Pós decremento 2: " + valor5);

        int numero6  = 5;
        int valor6 = 5 + --numero6; //incrementa antes
        System.out.println("Pós decremento 3: " + valor6);

        int x1 = 4;
        x1 += 2; // x1 = x1 + 2
        System.out.println("Valor de x1: " + x1);
        int x2 = 4;
        x2 -= 2; // x2 = x2 - 2
        System.out.println("Valor de x2: " + x2);
        int x3 = 4;
        x3 *= 2; // x3 = x3 * 2
        System.out.println("Valor de x3: " + x3);
        int x4 = 4;
        x4 /= 2; // x4 = x4 / 2
        System.out.println("Valor de x4: " + x4);
        int x5 = 4;
        x5 %= 2; // x5 = x5 % 2
        System.out.println("Valor de x5: " + x5);

        double ale = Math.random();
        int n = (int) (5 + ale * (10-5));
        System.out.println("Segue o valor randomico: " +n);
    }
}
