package cpc.recurssion2;

import java.util.Scanner;

public class rang {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        range(a, key);        
        sc.close();
         
    }

    public static int firstocc(int a[], int i, int key) {
        if (i == a.length) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return firstocc(a, i + 1, key);
    }

    public static int lastocc(int a[], int i, int key) {
        if (i == -1) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return lastocc(a, i - 1, key);
    }

    public static void range(int a[],int key) {
        int fir = firstocc(a, 0, key);
        if (fir == -1) {
            System.out.println(key+" is not presnt");
            return;
        }
        int las = lastocc(a, a.length-1, key);
        if (fir == las) {
            System.out.println(fir);
        } else {
            System.out.println("range:"+fir+" to "+las);
        }
    }
}
