import java.io.*;
import java.util.*;

class unlock2 {

	static String max;

	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int k = sc.nextInt();
        String str = "";

        String[] inp = sc.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
            str += inp[i];
        }
		
	    max = str;
		findMaximum(str, k);

        char[] st = max.toCharArray();
        for (char c : st) {
            System.out.print(c+" ");
        }
	}

	
	public static void findMaximum(String str, int k) {
		if (k == 0) {
			return;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) < str.charAt(j)) {
					str = swap(str, i, j);

					if (Integer.parseInt(str) > Integer.parseInt(max)) {
						max = str;
					}

					findMaximum(str, k - 1);
					str = swap(str, i, j);
				}
			}
		}
	}

	public static String swap(String str, int i, int j) {
		char ith = str.charAt(i);
		char jth = str.charAt(j);

		String left = str.substring(0, i);
		String middle = str.substring(i + 1, j);
		String right = str.substring(j + 1);

		return left + jth + middle + ith + right;
	}
		
}


                        
                        