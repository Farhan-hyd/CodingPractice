public class subsetgen {

    public static void main(String[] args) {
        char[] inp = { 'a', 'b', 'c','\0' };
        char[] oup = new char[10];
        genratesubseq(inp, oup, 0, 0);
    }

    public static void genratesubseq(char[] inp, char[] oup, int i, int j) {
        if (inp[i] == '\0') {
            oup[j] = '\0';
            for (char c : oup) {
                System.out.print(c + " ");
            }
            System.out.println();
            return;
        }

        oup[j] = inp[i];
        genratesubseq(inp, oup, i + 1, j + 1);

        genratesubseq(inp, oup, i + 1, j);
    }
}
