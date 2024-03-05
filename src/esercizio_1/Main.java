package esercizio_1;

public class Main {
    public static void main(String[] args) {
        stringaPariDispari("ciao");
        annoBisestile(2024);
    }
    public static void stringaPariDispari(String stringa) {
        System.out.println(stringa.length() % 2 == 0);
    }
    public static void annoBisestile(int anno) {
//        if(anno % 4 == 0 ) {
//            if(anno % 100 == 0) {
//
//                if(anno % 400 == 0) {
//                    System.out.println(true);
//                } else {   System.out.println(false);}
//            }
//            else {
//                System.out.println(true);
//            }
//        } else {
//            System.out.println(false);
//        }
        if(anno % 4 == 0 && anno % 100 == 0 &&  anno % 400 == 0 || anno % 4 == 0 && anno % 100 != 0 && anno % 400 != 0 ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}