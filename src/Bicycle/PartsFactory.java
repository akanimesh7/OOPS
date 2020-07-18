package Bicycle;

import java.util.ArrayList;
import java.util.Hashtable;

public class PartsFactory {
	public static Parts create(Object[][] arr) {
		ArrayList<Part> partList = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			Hashtable<String, Object> table = new Hashtable<>();
			table.put("name",arr[i][0]);
			table.put("description",arr[i][1]);
			if(arr[i].length>=2)table.put("isSpare",arr[i][2]);
			partList.add(new Part(table));
		}
		return new Parts(partList);
	}
}
