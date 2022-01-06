package cpc.stlchallange;

import java.io.*;
import java.util.*;


class Res {
    String max = "";
}

class Solution {
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void findMaximumNum(char ar[], int k, Res r) {
        if (k == 0)
            return;
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[j] > ar[i]) {
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    String st = new String(ar);

                    if (r.max.compareTo(st) < 0) {
                        r.max = st;
                    }
                    findMaximumNum(ar, k - 1, r);

                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] inp = sc.nextLine().split(" ");

        String str = "";
        for (int i = 0; i < n; i++) {
            str += inp[i]; 
        }

        Res r = new Res();
        r.max = str;
        
        findMaximumNum(str.toCharArray(), k, r);
        
        char[] ch = r.max.toCharArray();
        for (char c : ch) {
            System.out.print(c+" ");
        }
    }
}

// #include<bits/stdc++.h>
// using namespace std;
// #define ll long  long

// int main(){
//     int N,K;
//     cin>>N>>K;

//     int arr[N+1],index[N+1];
//     for(int i=1;i<=N;i++){
//         cin>>arr[i];
//         index[arr[i]]=i;
//     }

//     int temp=N,i=1;
//     while(K && i<=N){

//         if(arr[i]!=temp){
//             int pos=index[temp];
//             index[arr[i]]=pos;
//             swap(arr[i],arr[pos]);
//             K--;
//         }
//         i++;
//         temp--;

//     }

//     for(int i=1;i<=N;i++)
//         cout<<arr[i]<<" ";
        
// }
