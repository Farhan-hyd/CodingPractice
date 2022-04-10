import java.util.Scanner;

public class replacepi {
    
    public static void replpi(char[] a, int i) {
        if (a[i] == '\0' || a[i+1] == '\0') {
            return;
        }
        if (a[i] == 'p' && a[i+1] == 'i') {
            int j = i+2;

            while (a[j] != '\0') {
                j++;
            }

            while (j>=i+2) {
                a[j+2] = a[j];
                j--;
            }
            a[i] = '3';
            a[i+1] = '.';
            a[i+2] = '1';
            a[i+3] = '4';
            replpi(a, i+4);
        } else {
            replpi(a, i+1);
        }
        return;
    }

    public static void main(String[] args) {
        char[] a = new char[25];

        Scanner sc = new Scanner(System.in);

        a = sc.next().toCharArray();

        replpi(a, 0);
        System.out.println(a);

        sc.close();

    }
}
