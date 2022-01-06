package cpc.recurssion1basics;

import java.util.Scanner;

public class pow {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(n,exp));
        sc.close();
    }

    public static int power(int base,int exp) {
        if(exp == 1) return base;
        return base*power(base, exp-1); 
    }
}
