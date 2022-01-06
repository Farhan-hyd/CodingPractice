package collectionframwrk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class arrayj {

    public static int Max(int a[], int low, int high) {

        if (low == high) {
            return a[low];
        }

        if (low == high + 1) {
            return a[low] > a[high] ? a[low] : a[high];
        } else {
            int mid = (low + high) / 2;
            int max1 = Max(a, low , mid);
            int max2 = Max(a, mid + 1, high);

            return max1 > max2 ? max1 : max2 ;
        }
    } 

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int size = Integer.parseInt(br.readLine());
        
        int[] arr = new int[size];

        String str[] = br.readLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);;
        }

        int max = Max(arr, 0, size-1);

        System.out.println(max);

    }

}
/* 
100
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
100
3117396100
2084888300
*/
