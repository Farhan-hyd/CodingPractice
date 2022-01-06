package comproj.june2021cf;

import java.util.*;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcase = 0;
        if(sc.hasNextInt()) 
            testcase=sc.nextInt();

        for(int i = 1 ; i <= testcase ; i++) {
            int D=sc.nextInt();
            int d=sc.nextInt();
            int P=sc.nextInt();
            int Q=sc.nextInt();
            
            int heist = 0;

            int intr = D / d;

            if (intr%2 == 0) {
                heist = d * ((intr / 2) * (2 * P + ( intr - 1 ) * Q));
                heist += (D % d ) * (P + intr * Q);
            } else {
                heist = d * (intr * ( P + (( intr - 1 ) / 2) * Q));
                heist += (D % d ) * (P + intr * Q); 
            }

            System.out.println(heist);
        }

        sc.close();
    }
}
