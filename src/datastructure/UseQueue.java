package datastructure;
import java.io.BufferedReader;
import java.io.FileReader;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        String textFile = System.getProperty("MidTermQuestion-master/src/data/self-driving-car.txt");

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String filePath = "src/data/self-driving-car";
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("File not found Exception");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("File Already closed");
            }
        }
    }
}
