//this Keyword
class Student{
	private int age;
	private String name;

	public void setAge(int age)
	{
		this.age=age;
		
	}
	public int getAge()
	{
		return age; 
	}
	public void setName(String name)
	{
		this.name="Navin";
		
	}
	public String getName()
	{
		return name; 
	}
	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Demo7{
	public static void main(String[] args){
	Student obj=new Student();
	Student obj1=new Student();
	obj.setData1(18);
	obj1.setData1(25);
	obj.setData2("Navin");
	obj1.setData2("kiran");
	obj.show();
	obj1.show();
	}
}

//OUTPUT: 18 Navin
//        25 Kiran
