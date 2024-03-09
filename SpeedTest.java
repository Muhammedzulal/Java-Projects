import java.util.Scanner;

public class SpeedTest {
    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";

        final String MOR = "\u001B[35m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String BLUE = "\u001B[34m";

        String[] array = { "almak", "ama", "bunlar", "zor", "sadece", "duymak", "anlatmak", "kitap", "araba",
                "getirmek", "selam", "son", "durmak", "hep", "yazmak", "ara", "devlet", "yol", "bilgi",
                "kelime", "merhaba", "sabah", "okul", "haber", "lamba", "hesap", "ekmek", "al", "satmak", "hain",
                "bilgisayar", "fare", "ekran", "telefon", "klasik", "ansiklopedi", "kapı", "cihaz" };
        double count = 0, count2 = 0;
        char exitChar = 'q';

        try (Scanner keyboard = new Scanner(System.in)) {
            long startTime = System.currentTimeMillis();
            System.out.println();
            System.out.println();
            System.out.println("Çıkmak istediğiniz zaman 'q' tuşuna basınız.");
            System.out.println();
            System.out.println("------------");
            for (int i = 0; i < array.length; i++) {
                int RandomIndex = (int) (Math.random() * array.length);
                System.out.println(array[RandomIndex]);
                String typedWord = keyboard.nextLine().trim();
                System.out.println("------------");
                if (array[RandomIndex].equals(typedWord)) {
                    count++;
                } else {
                    count2++;
                }
                if (typedWord.equals(exitChar + "")) {
                    break;
                }
            }
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime) / 1000;
            System.out.println();
            System.out.println();
            System.out.println(BLUE + "Doğru kelime :" + count + ANSI_RESET);
            System.out.println(RED + "Yanlış kelime :" + (count2 - 1) + ANSI_RESET);
            System.out.println(GREEN + "Geçen zaman :" + elapsedTime + "sn" + ANSI_RESET);
            double b = (double) (count / elapsedTime);
            System.out.println(MOR + "Saniyede ortalama yazılan kelime :" + b + ANSI_RESET);
            System.out.println();
            System.out.println();
        }
    }
}