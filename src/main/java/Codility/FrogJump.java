package Codility;

public class FrogJump {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        double distance = Y - X;
        int jumps = (int) Math.ceil(distance / D);

        return jumps;
    }
}
