import java.util.Scanner;

public class inversioncount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(invcnt(a, 0, n-1)+1);

        sc.close();
    }

    public static int invcnt(int a[],int s,int e) {
        if(s>=e) return 0;
        int mid =(s+e)/2;
        int x = invcnt(a, s, mid);
        int y = invcnt(a, mid+1, e);
        int z = merge(a,s,e);

        return x+y+z;
    }

    public static int merge(int a[],int s,int e) {
        int mid = (s+e)/2;
        int i = s;
        int j = mid+1;
        int k = s;

        int temp[] = new int[100];
        int inv = 0;

        while (i <= mid && j <= e) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
                inv += mid-i+1; 
            }
        }

        while (i<=mid) {
            temp[k++] = a[i++];
        }

        while (j<=mid) {
            temp[k++] = a[j++];
        }

        for (int l = s; l < e; l++) {
            a[l] = temp[l];
        }

        return inv;
    }
}
