
package Assignments;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FlatMap_Map.Person;
import FlatMap_Map.PersonDao;

/**
 * @author ustjavafsdb415
 *
 */
public class PersonService {

	public static void main(String[] args) {
		
		List<Person> persons = PersonDao.getAll();
		
		Optional<List<String>> checkNull = Optional.ofNullable(persons.stream().map(per -> per.getEmail()).filter(a -> !a.isBlank()).collect(Collectors.toList()));
		if (checkNull.isPresent()) {
			System.out.print(checkNull);
		} else
			System.out.println("word is null");
	}
}
