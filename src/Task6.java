
public class Task6 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

