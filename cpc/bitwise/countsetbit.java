package cpc.bitwise;

public class countsetbit {

    public static int countSetbitm1(int n) {
        int setbit = 0;

        while (n>0) {
            setbit += (n&1);
            n = n>>1;
        }

        return setbit;
    }

    public static int countsetbitm2(int n) {

        int ans = 0;

        while (n > 0) {
           
            n = n&(n-1);
            ans++;

        }

        return ans;
    }
    

    public static void main(String[] args) {
        int n = 13;

        System.out.println(countSetbitm1(n));
        System.out.println(countsetbitm2(n));
        System.out.println(Integer.bitCount(n));
    }
}
