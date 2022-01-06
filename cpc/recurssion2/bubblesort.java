package cpc.recurssion2;

import java.util.Scanner;

public class bubblesort {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        a = Bubblesort(a,n);
        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }

    public static int[] Bubblesort(int arr[],int n) {
        if(n == 1){
            return arr;
          }
          
          for(int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j + 1]){
              arr = swap(arr ,j, j+1);
            }
          }
          
          return Bubblesort(arr, n-1);

    }

    public static int[] swap(int a[],int x,int y) {
        a[x] = a[x] ^ a[y];
        a[y] = a[x] ^ a[y];
        a[x] = a[x] ^ a[y];
        return a;
    }

}
