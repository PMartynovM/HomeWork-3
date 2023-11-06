public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int l = 1; l < 10; l++)
                System.out.print(i + " * " + l + " = " + i * l + "\t");
            // если проще (i * l + "\t")
        }
    }
}
