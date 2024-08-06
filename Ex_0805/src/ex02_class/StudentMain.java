package ex02_class;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		Student stu1 = new Student();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();
		
		System.out.println("---------------------------");
		Student stu2 = new Student();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();
		
		//Arrays클래스(임포트필요)
		//Math클래스(임포트안해도됨) -> 객체생성 안해도됨
		//String(임포트안함) -> 객체생성 안해도됨
		//Scanner(임포트필요)
		//Random(임포트필요)
		
		//대부분은 클래스 사용하려면 객체를 만들어야 함.
		//Math나 String이 특이한 케이스
		
		
		
		
		
		
		
	}
}
