import java.util.Scanner;

// https://www.homeandlearn.co.uk/java/java_formatted_strings.html details here

public class FormattedStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-3s %03d %n", s1, x);
            //System.out.format("%-15s %03d %n", s1, x);
        }


    }
}
