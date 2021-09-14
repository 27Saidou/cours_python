import java.io.*;
public class BufferExample {
    public static void main(String[] args)throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Entrez votre nom!");
        String name = br.readLine();
        System.out.println("bienvenue a mon university " + name);
        br.close();
        reader.close();
    }
}
