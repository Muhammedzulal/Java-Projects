public class example27 {
    public static int recursive(String Word, int count, int index) {
        if (index == Word.length()) {
            return count;
        }
        if (Word.charAt(index) == 'a') {
            count++;
        }

        return recursive(Word, count, index + 1);

    }

    public static void main(String[] args) {
        String Wordi = "Selamlar beyler benim adım java recursive bu proram kaç tane a olduğunu sayıp geri döndürüyor";
        System.out.println(recursive(Wordi, 0, 0));

    }
}
