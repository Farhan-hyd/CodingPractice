import java.io.*;

public class maxid {

    static int largest(int[] arr) {
        int i, ind = 0;

        int max = arr[0];

        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind=i;
            }
        }

        return ind;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        while (testcase-- != 0) {
            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];
            String[] sa = br.readLine().split(" ");

            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(sa[i]);
            }

            int idx = largest(arr);
            int lid = size - idx;

            if (idx > lid) {
                System.out.println(lid+1);
            } else {
                System.out.println(idx+1);
            }
        }
    }
}
