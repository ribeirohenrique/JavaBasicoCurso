package com.curso;

public class RepeticaoFor {
    public static void main(String[] args) {
        for (int cc = 0; cc <= 2; cc++){
            System.out.println("Cambalhota");
        }

        for (int cc2 = 0; cc2 <= 6; cc2+= 2){
            System.out.println(cc2);
            for (int n = 0; n < 2; n++){
                System.out.println("Dentro do segundo for" + n);
            }
        }
    }
}
