package pack1;

import java.util.function.Predicate;

public class Demo1 
{
	//To check wheather the given number is greater or not
	
	public static void main(String[] args)
	{
		Predicate<Integer> predicate = (num) -> num>20;
		System.out.println(predicate.test(21));
		
	}

}
