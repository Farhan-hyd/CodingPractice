import java.io.*;
import java.util.*;

public class Flow009 {

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

    }
    
    public static void main(String[] args) throws IOException{
        try{
            FastReader sc = new FastReader();

            int testcase = sc.nextInt();

            while (testcase-- != 0) {
                int quantity = sc.nextInt();
                int price = sc.nextInt();
                
                double result = (double) (quantity * price);
                
                if (result > 1000){
                    result /= 10;
                } 
                
                System.out.println(result);      
            }
            
        }catch(Exception e){
            return;
        }
    }
}
