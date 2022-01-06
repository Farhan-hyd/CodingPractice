public class nbym {

    static int clearBititoj(int n,int i,int j){
        int ones = ~0;
        int left = (ones<<(j+1));
        int right = (1<<i)-1;
        int mask = left|right;

        return n&mask;
    } 

    static int replacebit(int n,int m,int i,int j){
        int n_ = clearBititoj(n, i, j);

        return n_|(m<<i);
    }
    
    public static void main(String[] args) {
        int n = 15;
        int m = 2;
        int i = 1;
        int j = 3;
        
        System.out.println(replacebit(n, m, i, j));
    }
}