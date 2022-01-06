import java.io.*;
import java.util.*;

public class stsort {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int size = 3;

        if(sc.hasNextInt())
            size = sc.nextInt();

        PriorityQueue<String> strarr = new PriorityQueue<>();
        
        for (int i = 0; i < size; i++) {
                strarr.add(sc.next());
        }


        for (String s : strarr) {
            System.out.println(s);
        }

        sc.close();
    }
}

