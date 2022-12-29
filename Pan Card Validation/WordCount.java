package Assignments;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String str = "Hello I am krishna. I have three years of IT experience. "
				+ "I worked in Infosys 2.5 years. Currently I work in UST";
		Map<String,Integer> hshmap = new HashMap<String,Integer>();
		
		String words[] = str.split(" ");
		
		for(String wor: words) {
			if(hshmap.containsKey(wor))
				hshmap.put(wor, hshmap.get(wor)+1);
			else
				hshmap.put(wor,1);
		}
		
		System.out.println(hshmap);
	}
}
