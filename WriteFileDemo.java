import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        File file=null;
        String content="merci koto pour ta determination dans le codage";
        try {
            file=new File("D:\\myfile5.txt");
            fos=new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            byte[] data=content.getBytes();
            fos.write(data);
            fos.flush();
            System.out.println("Fichier ecris avec successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(fos!=null){
                    fos.close();
                }
            } catch (Exception e) {
            System.out.println("erreur de fermeture du Stream"+e.getMessage());
            }
        }
    }
}
