import java.util.*;
import java.io.*;

public class TOTCRT {

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

        public static void main(String[] args) throws IOException{
            
            try {
                
                FastReader sc = new FastReader();

                int Testcase = sc.nextInt();

                while (Testcase-- != 0) {
                    int questions = sc.nextInt();

                    Map<String,Integer> m = new TreeMap<>();

                    for (int i = 0; i < questions*3; i++){
                        
                        String s = sc.next();
                        int sol = sc.nextInt();
                        
                        if (m.containsKey(s)) {
                            int newsol = m.get(s) + sol;
                            m.remove(s);
                            m.put(s, newsol);
                        } else {
                            m.put(s, sol);
                        }
                    }

                    int idx = 0;
                    int res[] = new int[m.size()];
                    for (Map.Entry<String,Integer> e : m.entrySet()) {
                        res[idx++] = e.getValue();
                    }

                    Arrays.sort(res);

                    for (int j : res) {
                        System.out.print(j+" ");
                    }
                    System.out.println();

                }


            } catch (Exception e) {
                return;
            }
        }

}
