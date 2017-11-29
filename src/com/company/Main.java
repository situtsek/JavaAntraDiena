package com.company;

import java.util.Scanner;

    public class Main {
        public static final int CHOISE_0 = 0;
        public static final int CHOISE_1 = 1;
        public static final int CHOISE_2 = 2;
        public static final int CHOISE_3 = 3;
        public static final int CHOISE_4 = 4;
        public static final int CHOISE_5 = 5;

        public static void main(String[] args) {
            // parodyti vartotojui, kiek yra užduočių
            //paklausti vartotojo kokio užduotį parodyti
            //nuskaityti vartotojo pasirinkima
            //pagal ivesta skaiciu rodyti uzduoties vykdyma
            //programa kartoja sia seka kol vartotojas neiveda 0
            Scanner skaitytuvas = new Scanner(System.in);
            while (true) {
                System.out.println("Turime isviso 1 uzduociu");
                System.out.println("Iveskite uzduoties numeri, kad ja matyti");
                System.out.println("Iveskite 0 programa bus baigta");
                int pasirinkimas = skaitytuvas.nextInt();

                switch (pasirinkimas) {
                    case CHOISE_0:
                        return;
                    case CHOISE_1:
                        Uzduotis01 pirmoji = new Uzduotis01();
                        break;

                }
            }
        }
    }