public class Dog extends Mammal
{
	private String name;
	private int ageYears;
	private String colour;
	
	public Dog (String name, int ageYears, String colour)
	{
		this.name = name;
		this.ageYears = ageYears;
		this.colour = colour;
	}
	
	@Override
	public String toString()
	{
		String dog;
		
		dog = name + " " + ageYears + " " + colour;
		
		return dog;
	}
	

}
