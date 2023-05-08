import java.util.Arrays;

public class Solution {
    public static int[] resolve(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        int lastMax = 0;
        for (int operation : A) {
            if (operation == N + 1) {
                lastMax = currentMax;
            } else if (operation >= 1 && operation <= N) {
                int index = operation - 1;
                counters[index] = Math.max(counters[index], lastMax);
                counters[index]++;
                currentMax = Math.max(currentMax, counters[index]);
            }
            else {
                throw new IllegalArgumentException("Invalid operation: " + operation + " in " + Arrays.toString(A));
            }
        }
        int finalLastMax = lastMax;
        return Arrays.stream(counters)
                .map(counter -> Math.max(counter, finalLastMax))
                .toArray();
    }
}
