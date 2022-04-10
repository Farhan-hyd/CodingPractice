import java.util.Scanner;

public class product {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(",");
    System.out.println(prod(input));
    sc.close();
  }

  public static int prod(String[] input) {
    return Integer.parseInt(input[0].trim()) * 
    Integer.parseInt(input[1].trim()) * 
    Integer.parseInt(input[2].trim());
  }
}
