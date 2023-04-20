class Student{
	 int age;
	 String name;

	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Demo2{
	public static void main(String[] args){
	Student obj=new Student();
	obj.age=18;
	obj.name="John";
	obj.show();
	}
}


//OUTPUT: 18 John
