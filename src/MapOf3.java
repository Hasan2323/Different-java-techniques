import java.util.List;
import java.util.Map;

/**
 * @Author Muhammad Saimon
 * @since May 5/23/21 11:02 AM
 */

public class MapOf3 {
    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("P1");
//        list1.add("Q1");
//        List<String> list2 = new ArrayList<>();
//        list2.add("P2");
//        list2.add("Q2");
//
//        Map<Integer, List<String>> map = Map.of(111, list1, 222, list2);
//        System.out.println(map);
//
//        list1.add("R1");
//        System.out.println(map);


        List<String> imtList1 = List.of("P1", "Q1");
        List<String> imtList2 = List.of("P2", "Q2");

        Map<Integer, List<String>> map = Map.of(111, imtList1, 222, imtList2);
        System.out.println(map);

        imtList1.add("R1");
        System.out.println(map);
    }
}