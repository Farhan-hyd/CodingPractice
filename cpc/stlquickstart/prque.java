package stlquickstart;

import java.util.Comparator;
import java.util.PriorityQueue;

public class prque {
    
    public static void main(String[] args) {
        PriorityQueue<student> stud = new PriorityQueue<>(Comparator.comparingInt(student::getMark).thenComparingInt(student::getAge).thenComparing(student::getName));
        stud.add(new student(12, 15, "Farhan"));
        stud.add(new student(13, 16, "Afra"));
        stud.add(new student(11, 17, "Afzan"));
        stud.add(new student(11, 15, "Farzan"));
        stud.add(new student(13, 16, "Farhan"));
        stud.add(new student(12, 19, "Faizan"));

        System.out.println("Age  Marks  Name");
        stud.forEach((st) -> System.out.println(st.age+"   "+st.mark+"\t   "+st.name));
    }
}


