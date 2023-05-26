public class Bird extends Mammal
{
	private String name;
	private int ageYears;
	private String colour;
	
	public Bird (String name, int ageYears, String colour)
	{
		this.name = name;
		this.ageYears = ageYears;
		this.colour = colour;
	}
	
	@Override
	public String toString()
	{
		String bird;
		
		bird = name + " " + ageYears + " " + colour;
	
		return bird;
	}
}
