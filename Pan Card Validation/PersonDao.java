package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDao {
	public static List<Person> getAll() {
		return Stream.of(
				new Person(101,"Kriz","Kriz@ust.com","chn",Arrays.asList("9876543210","8123456790"),"ABCDE1234E"),
				new Person(303,"JC","KrishJc@ust.com","hyd",Arrays.asList("8789765234","9089786752"),"12345QWT9A"),
				new Person(202,"Krishna","Krishna@ust.com","mdu",Arrays.asList("7123456789","9567345121"),"POIU65Z"),
				new Person(404,"Krizna","KrizJc@ust.com","chn",Arrays.asList("9873210654","8120345679"),"HNBGT34574"),
				new Person(505,"JCK","JCKrish@ust.com","hyd",Arrays.asList("8797652384","9088675297"),"123PLMNJ6U"),
				new Person(606,"KrishnaJC","Krishna_jc@ust.com","mdu",Arrays.asList("7123485679","9567351214"),"VDJYR2964P"))
				.collect(Collectors.toList());
	}
}
