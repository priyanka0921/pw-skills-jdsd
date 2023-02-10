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
public class Demo3{
	public static void main(String[] args){
	Student obj=new Student();
	obj.setData();
	obj.show();
	}
}
