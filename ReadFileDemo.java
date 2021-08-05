import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\myfile.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            while (bis.available() > 0) {
                System.out.println((char) bis.read());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException ie) {
            System.out.println("IOException" + ie.getMessage());
        } finally {
            try {
                if (bis != null && fis != null) {
                    fis.close();
                    bis.close();
                }
            } catch (Exception e) {
                System.out.println("Error dans file InputStream" + e.getMessage());
            }
        }
    }
}
