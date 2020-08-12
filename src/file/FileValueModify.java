package file;

import java.io.*;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/11/20 9:50 AM
 */

public class FileValueModify {
    public static void main(String[] args) {
        try {
            BufferedReader f1 = new BufferedReader(new FileReader(new File("src/file/input.txt")));
            BufferedReader f2 = new BufferedReader(new FileReader(new File("src/file/modify.txt")));
            String regex = "[,:]";
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            String[] f2Data = f2.readLine().split(regex);

            while ((line = f1.readLine()) != null) {
                String[] f1Data = line.split(regex);
                if (f1Data[0].equals(f2Data[0])) {
                    line = line.replace(f2Data[1], f2Data[2]);
                }
                inputBuffer.append(line);
                inputBuffer.append(System.lineSeparator());
            }
            f1.close();
            f2.close();
            FileOutputStream fileOut = new FileOutputStream("src/file/input.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
