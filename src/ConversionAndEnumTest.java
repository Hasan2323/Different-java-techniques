import java.util.Arrays;
import java.util.List;

public class ConversionAndEnumTest {
    public static void main(String[] args) {
//        int n = 9;
//        String s = Integer.toString(n);
//        if (n == Integer.parseInt(s)) {
//            System.out.println("good");
//        }
//
//        System.out.println();
        System.out.println(TestEnum.valueOf("MONTHLY").getDescription());
        System.out.println(TestEnum.WEEKLY.getDescription());
        System.out.println(TestEnum.WEEKLY.name());

        List<TestEnum> allEnumValues = Arrays.asList(TestEnum.values());
        //System.out.println(Collections.sort(allEnumValues));
        System.out.println(allEnumValues);
        System.out.println("apple".compareTo("banana"));

    }
}
