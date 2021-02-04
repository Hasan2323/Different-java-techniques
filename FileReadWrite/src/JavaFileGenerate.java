import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class JavaFileGenerate {

    //private static String filePath = "/home/saimon/workspace/saimon-project/FileGenerate/src/File/bkash.html";

    public static void main(String[] args) throws IOException {

        String filePath2 = "/home/saimon/workspace/saimon-project/FileGenerate/src/File/bkash.html";

//        String fileSeparator = System.getProperty("file.separator");
//
//        //absolute file name with path
//        String absoluteFilePath = fileSeparator+"home"+fileSeparator+"saimon"+fileSeparator+"workspace"+fileSeparator+"FileGenerate"+fileSeparator+"file.txt";
//        File file = new File(absoluteFilePath);
//        if(file.createNewFile()){
//            System.out.println("File Created");
//        }else System.out.println(file+" already exists");

        File file = new File(filePath2);
        if (file.exists()) {
            file.delete();
        }

        String hello = "<html>" +
                "<head></head>" +
                "<body>b</body>" +
                "</html>";
        try {
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write(hello);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            System.out.println(file.getAbsolutePath());
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }

    }//end of main()
}
