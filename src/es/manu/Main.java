package es.manu;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("0 ");
            for (int j = 0; j < 8; j++) {
                if (i == 0 || i == 9) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }


                if (j == 7) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
