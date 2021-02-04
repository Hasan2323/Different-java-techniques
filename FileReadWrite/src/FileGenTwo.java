import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileGenTwo
{
    public static void main(String args[]) throws IOException {
//        try
//        {
//            FileOutputStream fos=new FileOutputStream("ashik.html",true);  // true for append mode
//
//            String str = "Ashik Pagla!";
//
//            byte[] b= str.getBytes();       //converts string into bytes
//            fos.write(b);           //writes bytes into file
//            fos.close();            //close the file
//            System.out.println("file saved.");
//
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }

        File file = new File("name.txt");
        if (file.exists()) file.delete();

        String fileData = "<h1>Pankaj Kumarr</h1>";
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(fileData.getBytes());
        fos.flush();
        fos.close();
    }
}  