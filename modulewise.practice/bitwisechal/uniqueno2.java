import java.util.*;
import java.io.*;

public class uniqueno2 {
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

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> res = Uniquenos(a);

        res.forEach((r)->System.out.print(r+" "));

    }

    public static ArrayList<Integer> Uniquenos(int[] a){
        int AxorB = 0;

        for (int i = 0; i < a.length; i++) {
            AxorB ^= a[i];
        }


        int setbitpos = findPosition(AxorB) - 1;

        int A = firuniqueno(a,setbitpos);
        int B = AxorB ^ A;

        ArrayList<Integer> al = new ArrayList<>(); 

        if (A > B) {
            al.add(B);
            al.add(A);
        } else {
            al.add(A);
            al.add(B);
        }

        return al;
    }


    static int findPosition(int n) {
        return (int)(Math.log(n) / Math.log(2)) + 1;
    }

    public static int firuniqueno(int[] a, int i) {
        ArrayList<Integer> al = new ArrayList<>();
        int ans = 0;

        for (int j = 0; j < a.length; j++) {
            if (getBit(a[j], i) == 1) {
                al.add(a[j]);
            }
        }

        for (int j = 0; j < al.size(); j++) {
            ans ^= al.get(j);
        }

        return ans;
    }

    static int getBit(int n,int i){
        int mask = (1 << i);
        int bit = (n&mask) > 0 ? 1 : 0;
        return bit;
     }
}
