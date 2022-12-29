package Assignments;

import java.util.List;

import java.util.stream.IntStream;

public class PanCardValidation {
	public static void main(String[] args) {

		List<Person> persons = PersonDao.getAll();
		// List<Person> allPan = new ArrayList<>();
		// List<Person> validPan = new ArrayList<>();
		// List<String> invalidPan = new ArrayList<>();
		System.out.println("Valid Pan\n--------------------------------");
		persons.stream().filter(person -> validatePan(person.getPanCard())).forEach(person -> {
			System.out.println(person.getId() + " " + person.getPanCard());
		});

		System.out.println("\nInvalid Pan\n--------------------------------");
		persons.stream().filter(person -> !validatePan(person.getPanCard())).forEach(person -> {
			System.out.println(person.getId() + " " + person.getPanCard());
		});

	}

	private static boolean validatePan(String panCard) {
		// TODO Auto-generated method stub
		if (panCard.length() != 10)  return false;
		long size = IntStream.range(0, panCard.length()).
				filter(i->	(i>=0 && i<5 && panCard.charAt(i)>='A' && panCard.charAt(i)<='Z')
						|| (i>=5 && i<9 && Character.isDigit(panCard.charAt(i)))
						|| (i==9 && panCard.charAt(i)>='A' && panCard.charAt(i)<='Z'))
				.map(i-> panCard.charAt(i))
				.count();
		return size==10?true:false;
	}

}
