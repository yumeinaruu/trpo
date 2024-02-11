package task5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        final File FILE = new File("src/main/java/task3/poem.txt");
        try (FileReader fileReader = new FileReader(FILE)) {
            StringBuilder stringBuilder = new StringBuilder();
            int k;
            while ((k = fileReader.read()) != -1) {
                stringBuilder.append((char) k);
            }
            String[] words = stringBuilder.toString().split("[ .—…!?,\\r\\n]+");
            ArrayList<String> arrayList = new ArrayList<>();
            for(int i = 0; i < words.length; i++){
                arrayList.add(words[i]);
            }
            Collections.sort(arrayList);
            arrayList.stream().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File not found or corrupted");
        }
    }
}
