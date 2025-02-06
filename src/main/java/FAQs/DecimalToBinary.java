package FAQs;

public class DecimalToBinary {
    public static void main(String[] args) {
    //    System.out.println( decimalToBinary(74));
    //    System.out.println(binaryToDecimal("1001010"));

        System.out.println(10 ^ 9);
    }

    private static String decimalToBinary(int num) {
        String res = "";
        if (num == 0) {
            return "0";
        }
        while (num > 0) {
            int rem = num % 2;
            num /= 2;
            res = res + rem;
        }
        return new StringBuilder(res).reverse().toString();
    }
    private static int binaryToDecimal(String bin){
        int length = bin.length();
        int m = 1;
        int res = 0;
        for (int i = length-1; i >= 0 ; i--) {
            char last = bin.charAt(i);
            Integer lastBit = Integer.valueOf(String.valueOf(last));
            res = res + m * lastBit;
            m*=2;
        }
        return res;
    }
}
