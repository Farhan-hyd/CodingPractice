public class zerooneknapsack {

    public static void main(String[] args) {
        int[] wt = { 1, 2, 3, 5 };
        int[] price = { 40, 20, 30, 100 };
        int n = 4;
        int c = 7;
        System.out.println(profit(n, c, wt, price));
    }

    public static int profit(int n, int c, int[] wt, int[] price) {

        if (n == 0 || c == 0) {
            return 0;
        }

        int inc = 0, exc = 0;
        if (wt[n - 1] <= c) {
            inc = price[n - 1] + profit(n - 1, c - wt[n - 1], wt, price);
        }
        exc = profit(n - 1, c, wt, price);

        return Integer.max(inc, exc);
    }
}
