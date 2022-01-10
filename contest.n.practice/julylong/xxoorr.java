import java.io.*;
import java.util.*;

public class xxoorr {
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
                int m = sc.nextInt();

                int[] arr = new int[n];

                long sum = 0;
                int ans = 0;

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    sum += arr[i];
                }

                quickSort(arr, 0, n - 1);

                for (int i = 0; i < n; i++) {
                    for (int j = 0; i < m && j < n; j++) {
                        sum -= arr[i] ^ i;
                        if (sum > 0) {
                            ans++;
                        }
                    }
                }

                System.out.println(ans + 1);

            }

        } catch (Exception e) {
            return;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}

// #include <iostream>
// #include <vector>
// using namespace std;

// int main(){
//     int testcase;
//     cin>>testcase;
//     int ans,n,m;
//     while(testcase-- != 0){
//         cin >> n >> m ;
//         vector<int> a(n);
        
//         for (int& i : a) {
//             cin >> i;
//         }
        
//         vector<int> nsetbit(31);
//         int count;
//         int terms;
        
//         for (int i = 0; i <= 30; i++) {
//             count = 0;
            
//             for (int& i : a) {
//                 if(i%2 != 0){
//                     count++;
//                 }
//                 i /= 2;
//             }
            
//             nsetbit[i] = count;
//         }
        
//         ans = 0;
        
//         for (int i = 0; i <= 30; i++) {
//             if(nsetbit[i]%m == 0){
//                 ans += nsetbit[i] / m;
//             }else{
//                  ans += nsetbit[i] / m + 1;
//             }
//         }
        
//         cout << ans << endl;
//     }
    
//     return 0;
// }
