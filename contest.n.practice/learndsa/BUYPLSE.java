import java.io.*;
import java.util.Scanner;


public class BUYPLSE {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String[] inp =new String[4];
        if(sc.hasNext())
          inp=br.readLine().split(" ");
        int a=Integer.parseInt(inp[0]);
        int b=Integer.parseInt(inp[1]);
        int x=Integer.parseInt(inp[2]);
        int y=Integer.parseInt(inp[3]);
        int cost = (a*x) + (b*y);
        System.out.println(cost);  
        sc.close();
          
    }
}
