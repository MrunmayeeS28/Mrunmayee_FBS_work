package Test;

class Student{
	int rollNo;
	char name[];
	int marks;
}

public class Demo {

	public static void main(String[] args) {
		Student s1;
		s1 = new Student();
		System.out.println(s1);
		System.out.println("Roll no:"+s1.rollNo+" Name:"+s1.name+" Marks:"+s1.marks);

	}

}
