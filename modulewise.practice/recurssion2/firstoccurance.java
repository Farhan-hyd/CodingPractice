import java.util.Scanner;

public class firstoccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(firstocc(a, 0, key));
        System.out.println(lastocc(a, n - 1, key));
        
        sc.close();
    }

    public static int firstocc(int[] a, int i, int key) {
        if (i == a.length) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return firstocc(a, i + 1, key);
    }

    public static int lastocc(int[] a, int i, int key) {
        if (i == -1) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return lastocc(a, i - 1, key);
    }
}
