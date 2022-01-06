import java.util.ArrayList;

public class leapyear {

  public static void main(String[] args) {
    ArrayList<Integer> leapYears = new ArrayList<Integer>();
    int startingYear = 1900;

    for (int i = startingYear; i < startingYear + 15; i++) {
      if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
        leapYears.add(i);
      }
    }

    leapYears.forEach(System.out::println);
  }
  
}
