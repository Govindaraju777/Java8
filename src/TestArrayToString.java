import java.util.ArrayList;
import java.util.List;

public class TestArrayToString {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		
		String numsStr = nums.toString();
		
		System.out.println(nums);
		System.out.println(numsStr);
	}
}
