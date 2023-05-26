import java.util.*;

public class MammalDriver
{
	public static void main(String [] args)
	{	
		Dog dog = new Dog("Spotty", 5, "brown");
		
		Cat cat = new Cat("Moon", 10, "white");
		
		Bird bird = new Bird("Tom", 3, "green");
		
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(bird);
		
	}

}
