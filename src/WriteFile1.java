import java.io.FileWriter;
public class WriteFile1 {

    public static void main(String[] args) {
        String txt1 = "hello world";

        try {
            FileWriter fileWriter = new FileWriter("example.txt");
            fileWriter.write(txt1);
            fileWriter.close();

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
