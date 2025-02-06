package Codility;


// A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
// N is an integer within the range [1...2,147,483,647];

import java.util.Stack;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        boolean hasOne = false;
        int count = 0, max = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (hasOne) {
                    if (count > max) {
                        max = count;
                    }
                }
                count = 0;
                hasOne = true;
            } else {
                count++;
            }
        }
        return max;
    }
}