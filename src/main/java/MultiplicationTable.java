public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int l = 1; l < 11; l++)
                System.out.print(i * l + " ");
        }
    }
}
