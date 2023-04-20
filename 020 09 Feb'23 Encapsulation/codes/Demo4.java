class Student{
	private int age;
	private String name;

	public void setData()
	{
		age=18;
		name="Navin";
	}
	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Demo4{
	public static void main(String[] args){
	Student obj=new Student();
	Student obj1=new Student();
	obj.setData();
	//obj1.setData();
	obj.show();
	obj1.show();
	
	}
}
