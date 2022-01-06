package comproj.gfgp;

import java.util.*;
import java.io.*;

// Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class middleofll {

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
            FastReader fr = new FastReader();
            
            int testcase = fr.nextInt();

            while (testcase-- > 0) {
                
                int n = fr.nextInt();

                Node head = new Node(fr.nextInt());
                Node tail = head;

                for (int i = 1; i < n-1 ; i++) {
                    tail.next = new Node(fr.nextInt());
                    tail = tail.next;
                }
                
                Solution g = new Solution();

                int m = g.getMiddle(head);
                System.out.println(m);
            }
        }

}


class Solution{
    //find middle of linked list
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        return slow.data;
         
    }
}
