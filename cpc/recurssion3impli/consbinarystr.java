package cpc.recurssion3impli;

import java.util.Scanner;

public class consbinarystr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cons1(n));
        sc.close();
    }

    public static int cons1(int n) {
        
        int res = 0;
        while (n>0) {
            n &= (n<<1);
            res++;
        }

        return res;
    }
}
