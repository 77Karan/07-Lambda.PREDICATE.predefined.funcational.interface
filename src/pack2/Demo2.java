package pack2;

import java.util.function.Predicate;

public class Demo2
{
	//To check if person name has having 7 charetecrs or not.
	public static void main(String[] args) 
	{
		Predicate<String> predicate = (name) -> name.length()>=7;
		
		System.out.println(predicate.test("Ashok "));
		
	}

}
