import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class test2 {

    public static void main(String args[]) throws Exception {

        String dataFileName = "/home/saimon/workspace/saimon-project/Different_Java_Techniques/filename.txt";

        int colName = 0, colBangla = 0, colEnglish = 0, colMath = 0, colReligion = 0;
        List<String> name = null, bangla = null, english = null, math = null, religion = null;

        BufferedReader bReader = new BufferedReader(new FileReader(dataFileName));
        String line = bReader.readLine();
        String[] columnOrder = line.split(",");

        for (int i = 0; i < columnOrder.length; i++) {
            switch (columnOrder[i]) {
                case "Name":
                    colName = i;
                    break;
                case "Bangla":
                    colBangla = i;
                    break;
                case "English":
                    colEnglish = i;
                    break;
                case "Math":
                    colMath = i;
                    break;
                case "Religion":
                    colReligion = i;
                    break;
            }
        }


        while ((line = bReader.readLine()) != null) {
            String[] dataValue = line.split(",");
            name.add(dataValue[colName]);
            bangla.add(dataValue[colBangla]);
            english.add(dataValue[colEnglish]);
            math.add(dataValue[colMath]);
            religion.add(dataValue[colReligion]);
        }

        System.out.println(name.get(1));

//        String dataFileName = "/home/saimon/workspace/saimon-project/Different_Java_Techniques/filename.txt";
//        String line;
//        boolean isFirstColumn = true;
//
//        BufferedReader bReader = new BufferedReader(new FileReader(dataFileName));
//        int[] orders = new int[3];
//
//        while ((line = bReader.readLine()) != null) {
//
//            String dataValue[] = line.split(",");
//
//            if(isFirstColumn) {
//                for (int i = 0; i < dataValue.length; i++) {
//                    switch (dataValue[i]) {
//                        case "firstName":
//                            orders[0] = i;
//                            break;
//                        case "lastName":
//                            orders[1] = i;
//                            break;
//                        case "address":
//                            orders[2] = i;
//                            break;
//                    }
//                }
//                isFirstColumn = false;
//                continue;
//            }
//
//            String firstName = dataValue[orders[0]];
//            String lastName = dataValue[orders[1]];
//            String address = dataValue[orders[2]];
//
//            System.out.println(lastName + " " + firstName + "," + address);
//        }
//        bReader.close();
    }
}