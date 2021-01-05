package com.curso;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("A região do sistema é: " + local.getISO3Country());
        System.out.println("O idioma do sistema é: " + local.getDisplayLanguage());
    }
}
