import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileWriter;

public class WriteFile2 {
    public static void main(String[] args) {
        String txt = "This is an example text.";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.append(txt);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
