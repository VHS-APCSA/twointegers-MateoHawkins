public class Integers
{
	private int integer1;
	private int integer2;
	
	public Integers()
	{
		integer1 = 0;
		integer2 = 0;
	}
	public Integers(int integer1, int integer2)
	{
		this.integer1 = integer1;
		this.integer2 = integer2;
	}
	public int getInteger1()
	{
		return integer1;
	}
	public int getInteger2()
	{
		return integer2;
	}
	public void setInteger1(int integer1)
	{
		this.integer1 = integer1;
	}
	public void setInteger2(int integer2)
	{
		this.integer2 = integer2;
	}
	public Integers arithmetic(Integers integer)
	{
		int integer1 = this.integer1 * integer.getInteger1();
		int integer2 = this.integer2 * integer.getInteger2();
		Integers result = new Integers(integer1, integer2);
		return result;
	}
	public double toDecimal()
	{
		double result = (double) integer1 / integer2;
		return result;
	}
	@Override
	public String toString()
	{
		return integer1 + " / " integer2;
	}
}