package Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAssignment {
public static void main(String[] args) {
	

	LinkedList< String> li = new LinkedList<>();
	
	li.add("Acd");
	li.add("Sam");
	li.add("Krishna");
	li.add("Sekar");
	li.add("krish");
	li.add("bala");
	li.add("chandra");
	li.add("mani");
	li.add("Ram");
	li.add("saran");
	
//	for (String string : li) {
//		if (string.startsWith("S") || string.startsWith("s"))
//		{
//			System.out.println(string);
//		}
//	}
	
	List<String> newlist = li.stream().filter(str -> str.startsWith("s") || str.startsWith("S")).toList();
	System.out.println(newlist);
}
}
