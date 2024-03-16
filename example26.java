public class example26 {

    public static int recursive(int array[], int i, int maks) {
        if (i == array.length) {
            return maks;
        }
        if (array[i] > maks) {
            maks = array[i];
        }
        return recursive(array, i + 1, maks);
    }

    public static void main(String[] args) {
        int array[] = { 0, 1, 2, 3, 4, 51, 6, 7, 8, 9 };
        System.out.println(recursive(array, 0, array[0]));
    }
}
