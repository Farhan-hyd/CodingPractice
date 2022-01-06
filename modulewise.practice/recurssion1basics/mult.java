import java.util.Scanner;

public class mult {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(mul(x,y));
        sc.close();
    }

    public static int mul(int x,int y) {
        if(y==1) return x;
        return x+mul(x, y-1);
    }
}
