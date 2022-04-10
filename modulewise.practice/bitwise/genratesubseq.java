public class genratesubseq {

    public static void filter(char[] a, int n) {

        int j = 0;

        while (n > 0) {
            int lastBit = (n & 1);

            if (lastBit == 1) {
                System.out.print(a[j]);
            }

            j++;
            n = n >> 1;
        }

        System.out.println();

    }

    public static void printsubset(char[] a) {

        int n = a.length;

        for (int i = 0; i < (1 << n); i++) {
            filter(a, i);
        }

    }

    public static void main(String[] args) {
        char[] a = { 'a', 'b', 'c', 'd' };

        printsubset(a);
        
    }
}
