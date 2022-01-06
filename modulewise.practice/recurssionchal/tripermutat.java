import java.util.*;
import java.io.*;

public class tripermutat {

    public static HashSet<String> hs = new HashSet<>();

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader sc = new FastReader();
        String str = sc.next();
        
        int n = str.length();
        tripermutat permutation = new tripermutat();
        permutation.permute(str, 0, n - 1);

        String[] a = new String[hs.size()];

        int i = 0;
        for (String string : hs) {
            a[i++] = string;
        }

        Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);

        for (String string : a) {
            System.out.println(string);
        }

    }

    private void permute(String str, int l, int r) {
        if (l == r)
            hs.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        
        return String.valueOf(charArray);
    }
}