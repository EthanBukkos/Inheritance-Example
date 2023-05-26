public class Cat extends Mammal
{
	private String name;
	private int ageYears;
	private String colour;
	
	public Cat (String name, int ageYears, String colour)
	{
		this.name = name;
		this.ageYears = ageYears;
		this.colour = colour;
	}
	
	@Override
	public String toString()
	{
		String cat;
		
		cat = name + " " + ageYears + " " + colour;
		
		return cat;
	}
}
