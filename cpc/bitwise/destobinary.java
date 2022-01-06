package cpc.bitwise;

public class destobinary {
    
    public static int bin(int n) {
        int binform = 0;
        int i = 1;
        while (n>0) {

            int lastbit = (n&1);
            binform += lastbit*i;
            n = n>>1;
            i *= 10;
            
        }

        return binform;
    }

    public static void main(String[] args) {
        int n = 13;


        System.out.println(bin(n));
        System.out.println(Integer.toBinaryString(n));
    }
}
