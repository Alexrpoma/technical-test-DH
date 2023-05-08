
public class App {
    public static void main(String[] args) {

        int[] A = {1, 1, 4, 6, 1, 5, 5};
        int N = 5;

        int[] counters = Solution.resolve(N, A);
        for (int counter : counters) {
            System.out.print(counter + " ");
        }
    }
}
