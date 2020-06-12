public class ConversionAndEnumTest {
    public static void main(String[] args) {
//        int n = 9;
//        String s = Integer.toString(n);
//        if (n == Integer.parseInt(s)) {
//            System.out.println("good");
//        }
//
//        System.out.println();
        System.out.println(TestEnum.valueOf("DISTRIBUTOR_REFUND").getDescription());
        System.out.println(TestEnum.SCHEDULE_REFUND.getDescription());
    }
}
