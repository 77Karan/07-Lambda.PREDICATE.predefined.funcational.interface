package pack3;

import java.util.function.Predicate;

public class Demo3 
{
	public static void main(String[] args) 
	{
		String[] names = {"Azar", "Sachin","Brain","Asahis","Anil","Rahul"};
		Predicate<String> per = (name) -> name.startsWith("A");
		
		for(String name: names)
		{
			if(per.test(name))
			{
				System.out.println(name);
			}
		}
		
	}

}
