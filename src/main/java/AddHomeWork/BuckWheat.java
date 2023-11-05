package AddHomeWork;

public class BuckWheat {
    public static void main(String[] args) {
        int storagePerMonthOneKg = 100;
        int remainder = 100 % 6;
        int sumPerFullMonth = 0;
        int allKgPerMonth = 100 - remainder;

        for (int i = allKgPerMonth; i >= 0; i -= 6) {
            sumPerFullMonth = sumPerFullMonth + i;
        }
        int fullSum = (sumPerFullMonth * storagePerMonthOneKg) + (remainder * storagePerMonthOneKg);

        System.out.println(fullSum + " столько нужно деняг");
    }
}
