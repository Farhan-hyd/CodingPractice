public class phonekeypad {

    public static String[] keypad = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

    public static void genratename(char[] in, char[] out, int i, int j) {
        if (in[i] == '\0') {
            out[j] = '\0';
            for (char c : out) {
                System.out.print(c+" ");
            }
            System.out.println();
            return;
        }

        int digit = in[i] - '\0';
        if (digit == 1 || digit == 0) {
            genratename(in, out, i+1, j);
        }

        for (int k=0 ; keypad[digit].charAt(k) != '\0' ; k++) {
            out[j] = keypad[digit].charAt(k);

            genratename(in, out, i+1, j+1);
        }

        return;
    }

    public static void main(String[] args) {
        char[] in = {'1','2', '\0', '\0', '\0', '\0', '\0', '\0'};

        char[] out = new char[100];
        genratename(in, out, 0, 0);
    }
}
