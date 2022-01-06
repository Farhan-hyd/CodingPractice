import java.util.*;
import java.util.regex.*;
import java.io.*;

public class isPass {

    public final static Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    
	public static String isValid(String s){
       
        if (textPattern.matcher(s).matches()) {
            return "YES";
        }

	    return "NO";
	}
	
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        
        int t=0;
        if(sc.hasNextInt())
            t=br.read();

        while (t-- != 0) {
            String S = br.readLine();
            String isVal = isValid(S);
            System.out.println(isVal);
        }    

        sc.close();
	}
}
