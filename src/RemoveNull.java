import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class RemoveNull {
	public static void main(String[] args) {
			List  arrLists = new ArrayList();
			
			arrLists.add(null);
			arrLists.add(null);
			arrLists.add(null);
			arrLists.add("1");
			arrLists.add(null);
			arrLists.add(null);
			arrLists.add("2");
			
			List nullList = new ArrayList<>();
			nullList.add(null);
			System.out.println("arrLists.size = "+arrLists.size());
			
			arrLists.removeAll(nullList);
			
			System.out.println("arrLists.size = "+arrLists.size());
			for(Object s : arrLists){
				
			}
			
	}
}
