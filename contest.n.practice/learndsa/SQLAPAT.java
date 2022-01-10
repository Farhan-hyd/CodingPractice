import java.util.Scanner;

public class SQLAPAT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        if (sc.hasNextInt()) {
            n=sc.nextInt();
        }
        
        int[] arr = {1 ,2 ,3 ,4 ,5 };

        for (int i = 0; i < n; i++) {
            arr = numsequence(arr,i);
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
        }

        sc.close();
    }

    public static int[] numsequence(int[] a, int i) {
        if (i==0) {
            return a;
        }

        if (a[0]%10 == 0) {
            a[0] += 1;
            a[1] += 3;
            a[2] += 5;
            a[3] += 7;
            a[4] += 9;
        }else{
            a[0] += 9;
            a[1] += 7;
            a[2] += 5;
            a[3] += 3;
            a[4] += 1;
        }
        return a;
    }
    
}