package esercizio_2;

import java.util.Scanner;

public class es_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero intero");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(es2(number));
        scanner.close();


    }
    public static String es2(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "errore";
        };
    }
    }

