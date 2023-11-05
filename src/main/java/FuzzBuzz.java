public class FuzzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {   // использовать оператор сравнения ==
                System.out.println(i + " fizz");
            }
            if (i % 5 == 0) {
                System.out.println(i + " buzz");
            }
            if (i % 5 == 0 & i % 3 == 0) {
                System.out.println(i + " FizzBuzz");
            }
        }
    }
}
