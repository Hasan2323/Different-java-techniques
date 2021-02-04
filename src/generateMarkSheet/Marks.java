package generateMarkSheet;

import java.util.ArrayList;
import java.util.List;

public class Marks {
    public static void main(String[] args) {
        GenerateResultSheet resultSheet = new GenerateResultSheet();

        List<String> list = new ArrayList<>();
        list.add("ID,Name,Bangla,English,Math,Religion");
        list.add("01,Abir,60,65,70,75");
        list.add("02,Shanto,65,70,75,80");


        resultSheet.inputMarks(list);
        resultSheet.retrieveDataFromInput();
        resultSheet.markSheet();
    }
}