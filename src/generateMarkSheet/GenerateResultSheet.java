package generateMarkSheet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateResultSheet {
    File inputFolder, outputFolder;
    File inputMarks, resultSheet;
    List<String> studentDetails;

    public GenerateResultSheet() {
        inputFolder = new File("Input Folder");
        inputFolder.mkdir();

        outputFolder = new File("Output Folder");
        outputFolder.mkdir();
    }

    public void inputMarks(List<String> list) {

        inputMarks = new File(inputFolder.getPath() + "/marks.txt");
        try {
            inputMarks.createNewFile();
            PrintWriter printWriter = new PrintWriter(inputMarks);
            for (String marks : list) {
                printWriter.println(marks);
            }
            printWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void retrieveDataFromInput() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputMarks));
            studentDetails = new ArrayList<>();
            String student;
            while ((student = reader.readLine()) != null) {
                /*System.out.println(student);*/
                studentDetails.add(student);
            }
            studentDetails.remove(0);
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void markSheet() {
        for (String student : studentDetails) {
            String[] studentInfo = student.split(",");
            /*System.out.println(studentInfo[1]);*/
            resultSheet = new File(outputFolder.getPath() + "/" + studentInfo[0] + "-" + studentInfo[1] + ".txt");
            try {
                resultSheet.createNewFile();
                PrintWriter printWriter = new PrintWriter(resultSheet);
                printWriter.println("Name :" + studentInfo[1] + "    " + "Student Roll :" + studentInfo[0]);
                printWriter.println();
                printWriter.println();
                printWriter.println("-------------------------------------------");
                printWriter.println("Subject |  Marks  | Grade Point  | Grade  |");
                printWriter.println("-------------------------------------------");
                printWriter.println("Bangla  |" + studentInfo[2] + "       |" + "              |" + "        |");
                printWriter.println("English |" + studentInfo[3] + "       |" + "              |" + "        |");
                printWriter.println("Math    |" + studentInfo[4] + "       |" + "              |" + "        |");
                printWriter.println("Religion|" + studentInfo[5] + "       |" + "              |" + "        |");
                printWriter.println("-------------------------------------------");
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


}