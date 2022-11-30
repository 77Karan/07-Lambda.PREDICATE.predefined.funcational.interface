package pack4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo4 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Raju",20);
		Person p2 = new Person("Mick",10);
		Person p3 = new Person("Rani",21);
		Person p4 = new Person("SitaDevi",12);
		Person p5 = new Person("Rahul",35);
		Person p6 = new Person("Karan",27);
		Person p7 = new Person("Mango",13);

		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		Predicate<Person> pred = (person) -> person.getAge()>18;
		
		for(Person person: persons)
		{
			if(pred.test(person))
			{
				System.out.println(person.getName());
			}
		}
		
		
	}

}
