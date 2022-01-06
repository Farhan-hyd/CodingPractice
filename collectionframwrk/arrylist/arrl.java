package arrylist;

import java.util.*;

public class arrl {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(0, 16);
        al.add(15);
        al.add(18);
        al.add(19);
        for (int i = 0; i< al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        al.remove(3);
        for (int i = 0; i< al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}
