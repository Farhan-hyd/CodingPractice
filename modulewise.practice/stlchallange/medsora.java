import java.util.*;

public class medsora {

    public static int[] Merge(int a1[], int a2[], int n) {
        int a[] = new int[2*n];
        int id=0,i=0,j=0;
        int as = (2*n)-1;

        while(as-->0){
            if(i == n){
                while(j<n){
                    a[id]=a2[j];
                    id++;
                    j++;
                }
                break;
            }

            if(j == n){
                while(i<n){
                    a[id]=a1[i];
                    id++;
                    i++; 
                }
                break;
            }

            if (a1[i] < a2[j]) {
                a[id] = a1[i];
                id++;
                i++; 
            } else {
                a[id] = a2[j];
                id++;
                j++; 
            }
        }
        

        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        if(sc.hasNextInt())
         size=sc.nextInt();
        
        int a1[] = new int[size];
        int a2[] = new int[size];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int a[] = new int[2*size];
        a = Merge(a1,a2,size);

        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.println(a[size-1]);

        sc.close();

    }
}
