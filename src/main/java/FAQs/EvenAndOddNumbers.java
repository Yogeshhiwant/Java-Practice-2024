package FAQs;

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int even = 0;
        int odd = 0;

        while (num != 0) {
            if ((num % 10) % 2 == 0) {
                even++;
                num /= 10;
            } else {
                odd++;
                num /= 10;
            }
        }
        System.out.println("Even digits: " + even + "\nOdd digits: " + odd);

    }

}
