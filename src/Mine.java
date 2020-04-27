public class Mine {
    public static void main(String[] args) {
        for (int y = 0; y < 10; y = y + 1) {
            for (int x = 0; x < 10; x = x + 1) {
                System.out.print(y * 10 + x);
                System.out.print(", ");
            }
            System.out.println();
        }

    }
}
