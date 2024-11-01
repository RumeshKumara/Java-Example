import java.io.FileWriter;
public class WriteFile1 {

    public static void main(String[] args) {
        String txt1 = " Sri Lanka";

        try {
            FileWriter fileWriter = new FileWriter("example.txt", true);
            fileWriter.append(txt1);
            fileWriter.close();

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
