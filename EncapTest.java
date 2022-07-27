class Encap
{
	private long aadhar;
	private String name;
	private int age;
	public long getaadhar()
	{
		return aadhar;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int newValue)
	{
		age = newValue;
	}
	public void setname(String newValue)
	{
		name = newValue;
	}
	public void setaadhar(long newValue)
	{
		aadhar = newValue;
	}
}
public class EncapTest
{
	public static void main(String[] args)
	{
		Encap obj = new Encap();
		Encap obj2 = new Encap();
		obj.setname("Ram");
		obj.setage(26);
		obj.setaadhar(122212221222L);
		obj2.setname("Ganesh");
		obj2.setage(22);
		obj2.setaadhar(444444444444L);
		System.out.println("Name = "+ obj.getname());
		System.out.println("Age = "+ obj.getage());
		System.out.println("Aadhar = "+ obj.getaadhar());
		System.out.println("Name = "+ obj2.getname());
		System.out.println("Age = "+ obj2.getage());
		System.out.println("Aadhar = "+ obj2.getaadhar());
	}
}