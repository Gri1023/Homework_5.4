public class Main {
    public static void main(String[] args) {
        int a[] = {5,3,9};
        int b[] = {6,8,7};
        System.out.println(reverse(a));
        System.out.println(equal(a,b));
    }
    static int[] reverse (int[] a) {
        int reversed[] = new int [a.length];
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
            reversed[i] = a[i];
        }
        return reversed;
    }
    static boolean equal (int[] a, int[] b) {
        for (int i=0;i<a.length;i++)
            if (a.length == b.length)
                return true;
            else if (a[i] == b[i])
                return true;
    return false;
    }
}