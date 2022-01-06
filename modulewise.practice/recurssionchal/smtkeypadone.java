import java.util.*;
import java.io.*;

public class smtkeypadone {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static Character[][] charreff;

    static ArrayList<String> al= new ArrayList<>();
    static String[] arr = {"prateek", "sneha", "deepak", "arnav", "shikha", "palak", "utkarsh", "divyam", "vidhi", "sparsh", "akku"};

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        String s = sc.next();
        int num[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            num[i] = (int)s.charAt(i) - (int)'0';
        }

        printWords(num);

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].contains(al.get(i))){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    private static void printWords(int[] num) {
        MyKeyPad();
        al = printWords(num, num.length, 0, "");
    }

    private static void MyKeyPad() {
        charreff = new Character[10][5];
        charreff[0] = new Character[] { ' ' };
        charreff[1] = new Character[] { '.', '+', '@', '$' };
        charreff[2] = new Character[] { 'a', 'b', 'c' };
        charreff[3] = new Character[] { 'd', 'e', 'f' };
        charreff[4] = new Character[] { 'g', 'h', 'i' };
        charreff[5] = new Character[] { 'j', 'k', 'l' };
        charreff[6] = new Character[] { 'm', 'n', 'o' };
        charreff[7] = new Character[] { 'p', 'q', 'r', 's' };
        charreff[8] = new Character[] { 't', 'u', 'v' };
        charreff[9] = new Character[] { 'w', 'x', 'y', 'z' };
    }

    private static ArrayList<String> printWords(int[] numbers, int len, int numIndex, String s) {
        if (len == numIndex) {
            return new ArrayList<>(Collections.singleton(s));
        }

        ArrayList<String> stringList = new ArrayList<>();

        for (int i = 0; i < charreff[numbers[numIndex]].length; i++) {
            String sCopy = String.copyValueOf(s.toCharArray());
            sCopy = sCopy.concat(charreff[numbers[numIndex]][i].toString());
            stringList.addAll(printWords(numbers, len, numIndex + 1, sCopy));
        }
        
        return stringList;
    }
}
