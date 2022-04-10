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
      while (testcase-- != 0) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int n = (int) Math.ceil(n / 2.0);
        int sum = 0;
        for (int i = 0; i < n; i++) {
          sum += arr[i];
        }
        System.out.println(sum);
      }
    } catch (Exception e) {
      return;
    }
  }