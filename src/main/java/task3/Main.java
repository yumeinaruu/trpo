package task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final File file = new File("src/main/java/task3/poem.txt");
        try (FileReader fileReader = new FileReader(file)) {
            StringBuilder stringBuilder = new StringBuilder();
            int k;
            while ((k = fileReader.read()) != -1) {
                stringBuilder.append((char) k);
            }
            String[] words = stringBuilder.toString().split("[ .—!?,\\r\\n]+");
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].matches("^[аеёиоуыэюяАЕЁИОУЫЭЮЯ]{1}[А-я0-9]+[аеёиоуыэюяАЕЁИОУЫЭЮЯ]{1}")) {
                    System.out.println(words[i]);
                    count++;
                }
            }
            System.out.println("Number of words: " + count);
        } catch (IOException e) {
            System.out.println("File not found or corrupted");
        }
    }
}
