import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapToString {
	public static void main(String[] args) {
			Map<String,Object> test = new HashMap<>();
			
			List<String> channelIdLstFromDB = new ArrayList<String>();
			
			String nums = "100,200";
			channelIdLstFromDB.add(nums);
			
			
			test.put("1", 1);
//			test.put("1", 2);
			test.put("lists", channelIdLstFromDB);
			
			List<String> channelIdLstFromlmp = (List<String>) test.get("lists");
			String patternString = channelIdLstFromlmp.toString().replaceAll("[\\s\\[\\]]", " ");
			System.out.println(patternString);
	}
}
