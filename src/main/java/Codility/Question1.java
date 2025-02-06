package Codility;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(solution("15:15:00", "15:15:12"));
    }

    private static int solution(String S, String T) {
        int interesting = 0;
        int[] startTime = parseTime(S);
        int[] endTime = parseTime(T);

        for (int h = startTime[0]; h <= endTime[0]; h++) {
            for (int m = (h == startTime[0] ? startTime[1] : 0); m <= (h == endTime[0] ? endTime[1] : 59); m++) {
                for (int s = (h == startTime[0] && m == startTime[1] ? startTime[2] : 0); s <= (h == endTime[0] && m == endTime[1] ? endTime[2] : 5); s++) {
                    String time = String.format("%02d:%02d:%02d", h, m, s);
                    if (isInteresting(time)) {
                        interesting++;
                    }
                }
            }
        }
        return interesting;
    }

    private static boolean isInteresting(String time) {
        Set<Character> set = new HashSet<>();
        for (char c : time.replace(":", "").toCharArray()) {
            set.add(c);
        }
        return set.size() <= 2;
    }

    private static int[] parseTime(String time) {
        String[] parts = time.split(":");
        return new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])};
    }
}
