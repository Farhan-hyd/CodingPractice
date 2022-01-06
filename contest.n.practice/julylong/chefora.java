import java.util.*;
import java.io.*;

public class chefora {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            FastReader sc = new FastReader();
            int testcase = sc.nextInt();
            long m = 1000000007;

            while (testcase-- != 0) {

                int r = sc.nextInt();
                int l = sc.nextInt();

                long sum = 1;
                long base = cheforanum(r);
                for (int i = r + 1; i <= l; i++) {
                    sum *= power(base, cheforanum(i));
                }
                System.out.println(sum % m);
            }
        } catch (Exception e) {
            return;
        }
    }

    public static long cheforanum(int n) {
        int flag = 0, store = 0;
        for (int j = 0; j < Integer.MAX_VALUE; j++) {
            int temp = j;
            int count = 0;
            if (flag == n) {
                break;
            }

            while (temp != 0) {
                temp /= 10;
                count++;
            }

            if (count % 2 != 0) {
                if (isPalindrome(j)) {
                    store = j;
                    flag++;
                }
            }
        }
        return store;
    }

    public static boolean isPalindrome(int n) {
        String str = "" + n;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }

        return true;
    }

    public static long power(long base, long exp) {
        long MOD = 1000000007;
        if (exp == 0)
            return 1;

        if (exp == 1)
            return base % MOD;

        long t = power(base, exp / 2);
        t = (t * t) % MOD;

        if (exp % 2 == 0)
            return t;

        else
            return ((base % MOD) * t) % MOD;
    }
}
// class PalindromeAndPrefixSumEncapsulated:
//   def __init__(self, n):
//     self.n = n
//     self.i = 0
//     self.palindromes = [0]*n
//     self.prefixSums = [0]*n
   
//   def add(self, val):
//     self.palindromes[self.i] = val
//     self.prefixSums[self.i] = val
//     if self.i != 0:
//       self.prefixSums[self.i] += self.prefixSums[self.i-1]
//     self.i = self.i+1
   
//   def isFull(self):
//     return self.i == self.n
       
//   def getPrefixSumInRange(self, L, R):
//     return self.prefixSums[R]-self.prefixSums[L]
       
//   def getFirstPalin(self, index):
//     return self.palindromes[index]
 
     
// def createOddPalin(inp):
//   n = inp
//   palin = inp
//   n = n//10
//   while n > 0:
//     palin = palin*10+(n%10)
//     n = n//10
//   return palin;
 
 
// def generatePalindromes(palindromeAndPrefixSumEncapsulated):
//   i = 1
//   while not palindromeAndPrefixSumEncapsulated.isFull():
//     palindromeAndPrefixSumEncapsulated.add(createOddPalin(i))
//     i = i+1
   
 
// def solve(L, R, palindromeAndPrefixSumEncapsulated):
//     power = palindromeAndPrefixSumEncapsulated.getPrefixSumInRange(L-1, R-1);
//     base = palindromeAndPrefixSumEncapsulated.getFirstPalin(L-1);
//     return pow(base, power, 1000000007);
 
// palindromeAndPrefixSumEncapsulated = PalindromeAndPrefixSumEncapsulated(100001)
// generatePalindromes(palindromeAndPrefixSumEncapsulated)
// q = int(input())
// while q > 0:
//     q = q-1
//     line = input().split(" ")
//     L, R = int(line[0]), int(line[1])
//     print(solve(L, R, palindromeAndPrefixSumEncapsulated))
