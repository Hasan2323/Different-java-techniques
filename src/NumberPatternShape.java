import java.util.Scanner;

public class NumberPatternShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boun = sc.nextInt();

        int length = (2 * boun) - 1;
        int tempLength = length;
        int de = 1;

        // First line fixed
        for (int col = 0; col < length; col++) {
            System.out.print(boun + " ");
        }
        System.out.println();

        for (int row = 0; row < boun - 1; row++) {
            int fixedBoun = boun;
            for (int j = 0; j <= row; j++) {
                System.out.print(fixedBoun + " ");
                fixedBoun--;
            }

            for (int i = 1; i <= (length - 2); i++) {
                System.out.print((boun - de) + " ");
            }
            length -= 2;
            de++;


            int fixedBoun2 = boun - row;
            for (int m = 0; m <= row; m++) {
                System.out.print(fixedBoun2 + " ");
                fixedBoun2++;
            }

            System.out.println();

        }

        // second phase
        int secLength = 3;
        int secBoun = 2;
        int sign = 3;
        for (int row = boun - 2; row > 0; row--) {

            int fixedBoun = boun;
            for (int j = 1; j <= row; j++) {
                System.out.print(fixedBoun + " ");
                fixedBoun--;
            }

            for (int i = 1; i <= secLength; i++) {
                System.out.print(secBoun + " ");
            }
            secLength += 2;
            secBoun++;


            int fixedBoun2 = sign;
            for (int m = 1; m <= row; m++) {
                System.out.print(fixedBoun2 + " ");
                fixedBoun2++;
            }
            sign++;

            System.out.println();

        }

        // Last line fixed
        for (int col = 0; col < tempLength; col++) {
            System.out.print(boun + " ");
        }


    }
}
