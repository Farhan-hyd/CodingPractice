public class fastexp {

    public static int fexp(int a, int n) {
        int ans = 1;

        while (n > 0) {
            int lastBit = (n & 1);
            
            if (lastBit == 1) {
                ans *= a;
            }
            
            a *= a;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 6;

        System.out.println(fexp(a, n));
        System.out.println(Math.pow(a, n));
    }
}
