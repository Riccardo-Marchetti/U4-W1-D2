package esercizio_3;

import java.util.Scanner;

public class es_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Inserisci una stringa separata da virgole (digita ':q' per uscire):");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                suddividiStringa(input);
            }
        } while (!input.equals(":q"));

        scanner.close();
    }

    public static void suddividiStringa(String input) {
        String[] tokens = input.split(",");
        for (String token : tokens) {
            int i = 0;
            while (i < token.length()) {
                System.out.print(token.charAt(i));
                if (i < token.length() - 1) {
                    System.out.print(",");
                }
                i++;
            }
            System.out.println();
        }
    }
}
