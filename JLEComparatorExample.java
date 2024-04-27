package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JLEComparatorExample {

	public static void main(String[] args) {
		List<Person> listPerson=new ArrayList<>();
		listPerson.add(new Person("rahul", 23));
		listPerson.add(new Person("sham", 24));

		listPerson.add(new Person("kumar", 25));

		listPerson.add(new Person("kuma", 23));

		// with lambda expresssion
		// sort list by age
		Collections.sort(listPerson, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
		
		System.out.println(" sort persons by age in ascending order");
		listPerson.forEach(
           (person) -> System.out.println(" Person name : " + person.getName()));
     
	}

}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
       super();
       this.name = name;
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}