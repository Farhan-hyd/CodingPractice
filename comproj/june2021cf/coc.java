package comproj.june2021cf;

import java.io.*;
import java.util.Scanner;

public class coc {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testcase = 0;
        if(sc.hasNextInt()) 
            testcase=sc.nextInt();
        while (testcase-- != 0) {
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt(); 
            int a = Xa/xa ;
            int b = Xb/xb ;
            System.out.println(a+b);
        }
        sc.close();
    }
}
