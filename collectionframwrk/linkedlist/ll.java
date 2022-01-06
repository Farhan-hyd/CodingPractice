package collectionframwrk.linkedlist;

import java.util.*;

public class ll {

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> ls =new LinkedList<>();
        myll<Integer> myLL = new myll<>();


		for (int i = 0; i < 10; i++) {
            myLL.add(i+1);
            myLL.addFirst(-1*i);
		}

		myLL.print();

        System.out.println(myLL.removeLast());
        System.out.println(myLL.removeFrist());
        myLL.print(); 

        ls.add(5);
        System.out.println(ls.getLast());
        ls.addFirst(12);
        ls.addLast(15);
        System.out.println(ls);
        ls.removeFirst();
        ls.removeLast();
        System.out.println(ls);

    }
}