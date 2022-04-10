public class bitman {

    static boolean isEven(int n){
        return (n & 1) != 1;
    }

    static int getBit(int n,int i){
       int mask = (1 << i);
       int bit = (n&mask) > 0 ? 1 : 0;
       return bit;
    }

    static int setBit(int n , int i){
        int mask = (1 << i);
        return n|mask;
    }

    static int setBitzero(int n , int i){
        n &= ~(1 << i);
        return n;
    }


    static int clearBit(int n, int i){
        int mask = ~(1 << i);
        return n&mask;
    }

    public static int flipbit(int n,int i) {
        n ^= (1 << i );
        return n;
    }

    public static int leastsigBit(int n) {
        return (int)(Math.log(n ^ -n) / Math.log(2)) + 1;
    }

    static int updateBit(int n,int i,int v){
        int mask = ~(1 << i);
        return (n&mask)|(v<<i);
    }

    static int clearibit(int n,int i){
        int mask = (-1<<i);
        return (n&mask);
    }

    static int clearBititoj(int n,int i,int j){
        int ones = ~0;
        int left = (ones<<(j+1));
        int right = (1<<i)-1;
        int mask = left|right;

        return n&mask;
    } 
    
    public static void main(String[] args) {
        int n = 1;
        int i = 0; 
        
        System.out.println(isEven(n));
        System.out.println(getBit(n,i));
        System.out.println(setBit(n, i));
        System.out.println(setBitzero(n, i));
        System.out.println(flipbit(n, i));
        System.out.println(5&5<<2);
    }
}
