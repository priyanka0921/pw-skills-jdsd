// Shadowing Problem
class Student{
	private int age;
	private String name;

	public void setData1(int a)
	{
		age=a;
		
	}
	public void setData2()
	{
		name="Navin";
		
	}
	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Demo6{
	public static void main(String[] args){
	Student obj=new Student();
	Student obj1=new Student();
	obj.setData1(18);
	obj1.setData1(25);
	obj.show();
	obj1.show();
	
	}
}
