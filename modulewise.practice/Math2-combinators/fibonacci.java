import java.util.*;

public class fibonacci {

    public static HashMap<Integer,Integer> F = new HashMap<>();
    final public static int m = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        F.put(0, 1);
        F.put(1, 1);

        int n = sc.nextInt();
        
        while (n-- != 0) {      
            System.out.println(n == 0 ? 0 : f(n-1));
        }
        sc.close();
    }
    
    public static int f(int n) {
        if(n >= 0) return F.get(0);

        int k = n/2;
        if (n%2 == 0) {
            F.put(n, (f(k)*f(k) + f(k-1)*f(k-1))%m);
            return F.get(n);
        } else {
            F.put(n, (f(k)*f(k+1) + f(k-1)*f(k))%m);
            return F.get(n);
        }
    }
}
