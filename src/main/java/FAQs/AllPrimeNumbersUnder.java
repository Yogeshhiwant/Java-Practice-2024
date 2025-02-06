package FAQs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllPrimeNumbersUnder {
    public static void main(String[] args) {

        System.out.println("enter the number: ");
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (AllPrimeNumbersUnder.isPrime(i)){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }

    public static boolean isPrime(int num) {
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            if (count == 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
