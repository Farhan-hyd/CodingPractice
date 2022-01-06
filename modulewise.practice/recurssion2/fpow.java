import java.util.Scanner;

public class fpow {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println(fapow(n,exp));
        sc.close();
    }

    public static int fapow(int n,int e) {
        if(e==0) return 1;

        int smlnum = fapow(n, e/2);
        smlnum *= smlnum;

        if ((n&1) == 1) {
            return smlnum*n;
        }
        return smlnum;
    }
}
