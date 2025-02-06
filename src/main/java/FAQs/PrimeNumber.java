package FAQs;

import java.util.Random;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (PrimeNumber.isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number !");
        }
    }

    public static boolean isPrime(int num) {
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            if (count == 2) return true;
            return false;
        }
        return false;
    }
}
