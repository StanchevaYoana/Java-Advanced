import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = arraySum(nums, 0);
        System.out.println(sum);
    }

    private static int arraySum(List<Integer> nums, int index) {
        if (index == nums.size() - 1){
            return nums.get(index);
        }
        return nums.get(index) + arraySum(nums,index + 1);
    }
}
