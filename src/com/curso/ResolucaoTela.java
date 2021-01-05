package com.curso;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimensao = tk.getScreenSize();
        System.out.println("Resolução: " + dimensao.width + " x " + dimensao.height);
    }

}
