public abstract class Mammal
{
	private String name;
	private int ageYears;
	private String colour;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int ageYears)
	{
		this.ageYears = ageYears;
	}
	public int getAge()
	{
		return ageYears;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public String getColour()
	{
		return colour;
	}
	
	public abstract String toString();
	

}
	

