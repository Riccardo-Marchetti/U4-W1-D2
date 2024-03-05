package esercizio_4;

import java.util.Scanner;

public class es_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num = Integer.parseInt(scanner.nextLine());
        number(num);
        scanner.close();
    }
    public static void number(int num) {
       for (int i = num; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
}
