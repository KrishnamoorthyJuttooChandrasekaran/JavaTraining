package Assignments;

import java.util.ArrayList;
import java.util.List;

public class reduceSumOfOdd {
public static void main(String[] args) {
	
	List<Integer> lst = new ArrayList<>();
	lst.add(1);
	lst.add(3);
	lst.add(5);	
	lst.add(7);
	
	lst.add(8);lst.add(6);lst.add(2);lst.add(4);
	
	var sum =  lst.stream().filter(num -> num%2!=0).reduce(0,Integer::sum);
	//var sum =  lst.stream().filter(num -> num%2!=0).reduce(0,(a,b)->a+b);
	System.out.println(sum);
	
}

}
