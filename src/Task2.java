import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String inputFileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line + " ");
                stringArrayList.add(line);
            }

            System.out.println(lastShortestString(stringArrayList));

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private static String lastShortestString(ArrayList<String> stringArrayList) {

        String shortestLine = stringArrayList.get(0);

        for (String line : stringArrayList) {
            if (line.length() <= shortestLine.length()) {
                shortestLine = line;
            }
        }

        return shortestLine;

    }
}
