import java.io.*;
import java.util.ArrayList;

public class Task8 {

    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");
        File file1 = new File("encrypted_file.txt");

        cypher(file, file1, (byte) 5);
    }

    private static void cypher(File source, File destination, byte key) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(destination);
            byte[] buffer = new byte[2048];
            while ((is.read(buffer)) > 0) {
                for (byte b : buffer) {
                    b = (byte) (b ^ key);
                    System.out.println(b);
                    os.write(b);
                }
            }

        } finally {
            is.close();
            os.close();
        }
    }


}
