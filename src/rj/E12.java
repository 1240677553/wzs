package rj;

class Student1{
	static String schoolName;
};

public class E12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1.schoolName="江汉艺术职业学院";
		System.out.println("我是"+s1.schoolName+"的学生");
		System.out.println("我是"+s2.schoolName+"的学生");
	}

}
