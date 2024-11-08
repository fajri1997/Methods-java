import java.util.ArrayList;
import java.util.List;

public class SummationPractice {

    public static void main(String[] args) {



        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 12, 34, 66, 78));


        int totalSum = summationPractice(arrayList);
        System.out.println("The sum of the list is: " + totalSum);

    }

    static int summationPractice(List<Integer> nums) {
        int sum = 0;
        for (int number : nums) {
            sum += number;
        }
        return sum;
    }
}
