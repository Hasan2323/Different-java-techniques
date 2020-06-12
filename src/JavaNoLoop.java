public class JavaNoLoop {
    public static void main(String[] args){

        String s1 = "Allah-u-Akbar\n";
        String s3 = s1 + s1 + s1;
        String s10 = s3 + s3 + s3 + s1;
        String s30 = s10 + s10 + s10;
        String s100 = s30 + s30 + s30 + s10;
        System.out.println(s100);

        // to check, first convert string to array. then print length of this array.
        String[] arr = s100.split("\n");
        System.out.println(arr.length+" times!");


    }
}
