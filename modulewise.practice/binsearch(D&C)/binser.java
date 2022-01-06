public class binser {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        System.out.println(binarysearch(a, 0, n - 1, 6));
    }

    public static int binarysearch(int a[], int l, int h, int key) {

        int mid = (l + h) / 2;

        if (h >= l) {
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                return binarysearch(a, l, mid, key);
            } else {
                return binarysearch(a, mid + 1, h, key);
            }
        }
        
        return -1;
    }
}
