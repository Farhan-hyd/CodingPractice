import java.io.*;
import java.util.regex.*;


public class findnum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();
        int res;

        String result = exp.split("=")[1];
        String Operand1 = (exp.split("=")[0]).split("\\+")[0]; 
        String Operand2 = (exp.split("=")[0]).split("\\+")[1];
        
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);

        Matcher m1 =p.matcher(Operand1);
        Matcher m2 =p.matcher(Operand2);

        
        if (!m1.matches()) {
        
            res = Integer.parseInt(result) - Integer.parseInt(Operand2);
        
        } else { 
        
            if (!m2.matches()) {
        
                res = Integer.parseInt(result) - Integer.parseInt(Operand1);
        
            } else {
        
                res = Integer.parseInt(Operand1) + Integer.parseInt(Operand2);
        
            }
            
        }

        System.out.println(res);
    }
}