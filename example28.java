public class example28 {
    public static String recursive(String array[], int count, int i, String maks) {
        if (i == array.length) {
            return maks;
        }
        if (array[i].length() > maks.length()) {
            maks = array[i];
        }

        return recursive(array, count, i + 1, maks);

    }

    public static void main(String[] args) {
        String array[] = { "Akali", "Viego", "Zoe", "Fiora", "Qiyana", "Katarina" };
        System.out.println(recursive(array, 0, 0, array[0]));
    }
}
