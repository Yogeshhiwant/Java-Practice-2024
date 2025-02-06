package Codility;

public class Question2 {
    public static void main(String[] args) {

    }

    private static boolean solution(String S, String T) {
        return isMatch(S, T, 0, 0, 0, 0);
    }

    private static boolean isMatch(String S, String T, int i, int j, int skipS, int skipT) {
        int n = S.length();
        int m = T.length();

        if (i == n && j == m) return skipS == 0 && skipT == 0;
        if (i == n || j == m) return false;

        if (skipS > 0 && skipT > 0) return isMatch(S, T, i, j, skipS - 1, skipT - 1);
        if (skipS > 0) return isMatch(S, T, i + 1, j, skipS - 1, skipT);
        if (skipT > 0) return isMatch(S, T, i, j + 1, skipS, skipT - 1);

        char c1 = S.charAt(i);
        char c2 = T.charAt(j);

        if (Character.isDigit(c1) && Character.isDigit(c2)) {
            int skip1 = parseNumber(S, i);
            int skip2 = parseNumber(T, j);
            return isMatch(S, T, nextIndex(S, i), nextIndex(T, j), skip1, skip2);
        }
        if (Character.isDigit(c1)) {
            int skip1 = parseNumber(S, i);
            return isMatch(S, T, nextIndex(S, i), j, skip1, skipT);
        }
        if (Character.isDigit(c2)) {
            int skip2 = parseNumber(T, j);
            return isMatch(S, T, i, nextIndex(T, j), skipS, skip2);
        }
        if (c1 == c2) return isMatch(S, T, i + 1, j + 1, skipS, skipT);
        return false;
    }

    private static int nextIndex(String s, int i) {
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            i++;
        }
        return i;
    }

    private static int parseNumber(String s, int i) {
        int num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        return num;
    }
}
