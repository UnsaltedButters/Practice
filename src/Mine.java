public class Mine {
    public static void main(String[] args) {
        for (int y = 0; y < 10; y = y + 1) {
            for (int x = 0; x < 10; x = x + 1) {
                System.out.print(y * 10 + x);
                if (x == 9) {
                    System.out.print("");
                }
                if (x < 9)
                System.out.print(", ");
            }
            System.out.println();
        }

    }
}
//make the commas at the very right disappear