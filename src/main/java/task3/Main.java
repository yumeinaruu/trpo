package task3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        final File FILE = new File("src/main/java/task3/poem.txt");
        final File FILE_AFTER = new File("src/main/java/task3/final.txt");
        try (FileReader fileReader = new FileReader(FILE);
             FileWriter fileWriter = new FileWriter(FILE_AFTER)) {
            StringBuilder stringBuilder = new StringBuilder();
            int k;
            while ((k = fileReader.read()) != -1) {
                stringBuilder.append((char) k);
            }
            String[] words = stringBuilder.toString().split("[ .—!?…,\\r\\n]+");
            Object[] newArray = Arrays.stream(words)
                    .filter(value -> value.matches("^[аеёиоуыэюяАЕЁИОУЫЭЮЯ]{1}[А-я0-9]+[аеёиоуыэюяАЕЁИОУЫЭЮЯ]{1}"))
                    .toArray();
            Arrays.stream(newArray).forEach(System.out::println);
            Arrays.stream(newArray).forEach(value -> {
                try {
                    fileWriter.write(value.toString().hashCode());
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
            System.out.println("Number of words: " + newArray.length);
        } catch (IOException e) {
            System.out.println("File not found or corrupted");
        }
    }
}
