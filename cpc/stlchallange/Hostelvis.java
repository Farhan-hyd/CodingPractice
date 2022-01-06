package cpc.stlchallange;

import java.util.*;

public class Hostelvis {
    
    public static void main(String[] args) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);

        int query,k,type,x,y;
        int eq=0;
        if(sc.hasNextInt());
         query = sc.nextInt();
         k=sc.nextInt();

        for (int i = 0; i < query; i++) {
            type = sc.nextInt();
            if (type == 1) {
                x = sc.nextInt();
                y = sc.nextInt();
                long rokdist = (x*x) + (y*y);
                pq.add(rokdist);
                eq++;
            } else {
                if(eq <= k){
                    System.out.println(pq.poll());
                }else{
                    System.out.println(pq.poll());
                }   
            }
        }



        sc.close();
    
    }
}
