package com.curso.exercicios;
import java.util.*;
import java.text.*;

    public class DataAnterior {
        public static void main (String[] args) throws ParseException {
            /*
            DateFormat df = new SimpleDateFormat ("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.set (Calendar.DATE, 01);
            cal.set (Calendar.MONTH, 12);
            cal.set (Calendar.YEAR, 2021);
            System.out.println ("Dia Atual: " + df.format (cal.getTime()));
            cal.add (Calendar.DATE, -1);
            System.out.println ("Dia anterior: " + df.format (cal.getTime()));
            */
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = new GregorianCalendar();
            cal.add(Calendar.DATE, -1);
            String dataFormatada = df.format(cal.getTime());
            System.out.println(dataFormatada);

/*
            Calendar cal = new GregorianCalendar();
            int day = cal.get(Calendar.DAY_OF_MONTH);
            cal.add(Calendar.DATE, -1);
            int dayBefore = cal.get(Calendar.DAY_OF_MONTH);
            System.out.println(day); //1
            System.out.println(dayBefore); //31
*/


        }
    }
