import java.util.ArrayList;
import java.util.List;

public class SummationPractice {

    public static void main(String[] args) {


//        int[] ArrayList  = {1,2,3,5,6,7,12,34,66,78};
//        SummationPractice(ArrayList)
        List<Integer> ArrayList = new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 12, 34, 66, 78));

        System.out.println(SummationPractice(ArrayList));
    }

    static int SummationPractice(List<Integer> nums) {
        int sum = 0;
        for (int number : nums) {
            sum += number;
        }
        return sum;
    }
}
