import java.io.*;
import java.lang.*;
public class ListOfNumbers {
    // create list entier
    private int[] list = { 5, 6, 8, 9, 2 };

    public void writeList() {
        PrinteWriter out = null;

        try {
            System.out.println("Entering try statement");

            // creation new file OutputFile.txt
            out = new PrinteWriter(new FileWriter("OutputFile.txt"));

            //
            for (int i = 0; i < 7; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        }

        catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }

        finally {
            if (out != null) {
                System.out.println("Fermeture du printer");
                // close PrintWriter
                out.close();
            }

            else {
                System.out.println("PrintWriter pas ouvert");
            }
        }

    }
    public static void main(String[] args) {
        ListOfNumbers list=new ListOfNumbers();
        list.writeList();
    }
}
