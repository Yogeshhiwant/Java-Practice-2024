package Codility;

import java.util.*;

// RoadCount problem
public class Question3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3};
        int[] B = {2, 3, 1, 4};
        int N = 4;

        System.out.println(solution(A, B, N));
    }

    private static int solution(int[] A, int[] B, int N) {
        int[] roadCount = new int[N];
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int cityA = A[i] - 1;
            int cityB = B[i] - 1;

            roadCount[cityA]++;
            roadCount[cityB]++;

            map.putIfAbsent(cityA, new HashSet<>());
            map.putIfAbsent(cityB, new HashSet<>());

            map.get(cityA).add(cityB);
            map.get(cityB).add(cityA);
        }
        int maxRank = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int rank = roadCount[i] + roadCount[j];
                if (map.getOrDefault(i, Collections.emptySet()).contains(j)) {
                    rank--;
                }
                maxRank = Math.max(maxRank, rank);
            }
        }
        return maxRank;
    }
}
