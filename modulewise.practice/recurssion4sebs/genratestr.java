public class genratestr {
    
    public static void main(String[] args) {
        char[] a = new char[100];
        for (int i = 1; i < 5; i++) {
            a[i] = (""+i).toCharArray()[0];
        }
        char[] out = new char[100];

        genstr(a, out, 0, 0);

    }

    public static void genstr(char[] in, char[] out, int i, int j) {
        if(in[i] == '\0'){
            out[j] = '\0';
            for (char c : out) {
                System.out.print(c+" ");
            }
            System.out.println();
            return;
        }

        int dig = in[i] -'\0';
        char ch = (""+dig).toCharArray()[0];
        out[j] = ch;

        genstr(in, out, i+1, j+1);

        if (in[i+1] != '\0') {
            int secdig = in[i+1] - '\0';
            int no = dig*10 + secdig;

            if (no <= 26) {
                ch = (""+no).toCharArray()[0];
                out[j] = ch;
                genstr(in, out, i+2, j+1);
            }
        }
        return;
    }
}
