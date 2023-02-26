public class Initial {
    public static void main(String[] args) {
        // Set the initial to be printed
        char initial = 'S';

        // Loop to print the first three lines
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop to print the remaining lines
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 20; j++) {
                if ((i == 2 && j >= 2 && j <= 18) || (i == 3 && j == 2) || (i == 4 && j == 2) || (i == 5 && j >= 3 && j <= 17) || (i == 6 && j == 19) || (i == 7 && j == 19)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
