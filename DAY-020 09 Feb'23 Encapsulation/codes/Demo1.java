class Student{
	 int age;
	 String name;

	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Demo1{
	public static void main(String[] args){
	Student obj=new Student();
	obj.show();
	}
}


//OUTPUT: 0 null
