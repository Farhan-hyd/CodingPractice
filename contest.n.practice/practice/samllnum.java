import java.util.*;

public class samllnum{
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long newnum = 0;
		long i = 1;

		while(num != 0){
			long r = num%10;
			num /= 10;
			
			if(r > 4){
				r = 9 - r;
			}

			newnum += r*i;
			i *= 10; 
		}

		System.out.println(newnum);

		sc.close();
    }
	
}