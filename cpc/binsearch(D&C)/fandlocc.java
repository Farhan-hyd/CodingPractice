public class fandlocc {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 8, 8, 8, 9, 10, 11 };
        int n = a.length;

        System.out.println(firstocc(a, n, 8));
        System.out.println(lasttocc(a, n, 8));

    }

    public static int firstocc(int a[], int n, int key) {
        int s = 0;
        int e = n - 1;

        int ans = -1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] == key) {
                ans = mid;
                e = mid - 1;
            } else if (a[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static int lasttocc(int a[], int n, int key) {
        int s = 0;
        int e = n - 1;

        int ans = -1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] == key) {
                ans = mid;
                e = mid + 1;
            } else if (a[mid] > key) {
                e = mid - 1;
                break;
            } else {
                s = mid + 1;
            } 
        }
        return ans;
    }
}
