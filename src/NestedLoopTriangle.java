public class NestedLoopTriangle {
    public static void main(String[] args) {
        // Loop to iterate through rows
        for(int i = 1; i <= 5; i++) {
            // Loop to iterate through columns
            for(int j = 1; j <= i; j++) {
                // Print an asterisk for each column
                System.out.print("*");
            }
            // Move to the next row after each column
            System.out.println();
        }
    }
}
