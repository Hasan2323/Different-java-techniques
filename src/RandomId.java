import java.util.Arrays;
import java.util.UUID;

/**
 * @Author Muhammad Saimon
 * @since Aug 8/4/21 4:19 PM
 */

public class RandomId {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidTwo = UUID.randomUUID().toString();

        System.out.println("UUID : " + uuid);
        System.out.println("UUID (String) : " + uuidTwo);

        //RandomStringUtils.randomAlphabetic(5);


        // insert new data to an array
        String[] arr = {"Abid", "Hasan", "Saimon"};

        System.out.println("Data first: " + Arrays.toString(arr));

        String[] newArr = Arrays.copyOf(arr, arr.length + 2);
        newArr[newArr.length - 2] = "Miad";
        newArr[newArr.length - 1] = "Bhai";

        System.out.println("Data 2nd : " + Arrays.toString(newArr));

    }
}
