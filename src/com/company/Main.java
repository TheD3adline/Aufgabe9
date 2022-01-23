package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1, num2, function, loop;
        boolean reset;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Bitte geben Sie die erste Ganzzahl ein:");
            num1 = sc.nextInt();
            System.out.println("Bitte geben Sie die zweite Ganzzahl ein:");
            num2 = sc.nextInt();
            System.out.println("Zahl 1: " + num1);
            System.out.println("Zahl 2: " + num2);
            System.out.println("Wollen sie Ihre Zahlen: ");
            System.out.println("1: Addieren (+)");
            System.out.println("2: Subtrahieren (-)");
            System.out.println("3: Multiplizieren (*)");
            System.out.println("4: Dividieren (/)");
            function = sc.nextInt();
            switch (function) {
                case 1:
                    System.out.println("Die Summe der Addition betraegt: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Die Differenz der Subtraktion betraegt: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Das Produkt der Multiplikation betraegt: " + (num1 * num2));
                    break;
                case 4:
                    if(num2 == 0) {
                        System.out.println("Der Quotient der Division betraegt: 0 mit 0 Rest");
                    }
                    else {
                        System.out.println("Der Quotient der Division betraegt: " + (num1 / num2) + " mit " + (num1 % num2) + " Rest");
                    }
                    break;
                default:
                    System.out.println("ERROR: Diese Funktion ist nicht vorhanden, Berechnung abgebrochen!");
            }
            System.out.println("Wollen Sie noch eine Berechnung durchfuehren?");
            System.out.println("1: JA (RESET)");
            System.out.println("0: NEIN (EXIT)");
            loop = sc.nextInt();
            if(loop == 0) {
                reset = false;
                System.out.println("Programm wird beendet!");
            }
            else if(loop == 1) {
                reset = true;
                System.out.println("NEUSTART!");
            }
            else {
                System.out.println("ERROR: Falsche Eingabe, Programm abgebrochen!");
                reset = false;
            }
        } while(reset);
    }
}
