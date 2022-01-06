import java.util.*;

public class towerofhano {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mov(n, 'A', 'B', 'c');
        sc.close();
    }

    public static void mov(int disks,char src,char helper,char dest) {
        if(disks==0) return;
        mov(disks-1, src, dest, helper);
        System.out.println(disks+"th disk from "+src+" to "+dest);
        mov(disks-1, helper, src, dest);
    }
}
