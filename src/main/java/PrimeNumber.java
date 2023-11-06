import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean isPrime = true;

        System.out.println("Введите число");
        input = scanner.nextInt();

        if (input < 2) {
            isPrime = false;
        }
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(input + " Number is simple");
        } else {
            System.out.println(input + " Number is NOT simple");
        }
        if (input == 1) {
            System.out.print(input + " Number is simple");
        }
    }
}
