package telran.citizens.model;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
	private int id;
	private String firstName;
	private String lastName;

	private LocalDate birthDate;
	public Person(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = LocalDate.now().minusYears(age);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return LocalDate.now().getYear() - birthDate.getYear();
	}

	public void setAge(int age) {
		this.birthDate = LocalDate.now().minusYears(age);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + getAge() + "]";
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(id, o.id);
	}
}
