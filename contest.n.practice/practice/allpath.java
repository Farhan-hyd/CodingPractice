import java.util.*;

public class allpath{
	private static void printMatrix(int[][] mat, int m, int n,
                                    int i, int j, int[] path, int idx){
		path[idx] = mat[i][j];
		if (i == m - 1){
			for (int k = j + 1; k < n; k++){
				path[idx + k - j] = mat[i][k];
			}
			for (int l = 0; l < idx + n - j; l++){
			    if(l == idx + n - j - 1){
			        System.out.print(path[l]);
			    }else{
			        System.out.print(path[l] + " - ");
			    }
			}
			System.out.println();
			return;
		}
		
		if (j == n - 1){
			for (int k = i + 1; k < m; k++){
				path[idx + k - i] = mat[k][j];
			}
			for (int l = 0; l < idx + m - i; l++){
				if(l == idx + m - i - 1){
			        System.out.print(path[l]);
			    }else{
			        System.out.print(path[l] + " - ");
			    }
			}
			System.out.println();
			return;
		}
		
		printMatrix(mat, m, n, i + 1, j, path, idx + 1);

		printMatrix(mat, m, n, i, j + 1, path, idx + 1);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		int maxLengthOfPath = m + n - 1;
		printMatrix(mat, m, n, 0, 0, new int[maxLengthOfPath], 0);
		sc.close();
	}
}