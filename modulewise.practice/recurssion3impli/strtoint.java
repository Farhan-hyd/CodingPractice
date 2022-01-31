public class strtoint {

    public static int toint(char[] s, int n) {

        if (n == 0) {
            return 0;
        }

        int digit = s[n - 1] - '0';
        int smlans = toint(s, n - 1);

        return smlans * 10 + digit;
    }

    public static void main(String[] args) {

        String s = "1234";
        int n = s.length();

        System.out.println(toint(s.toCharArray(), n));
    }
}
