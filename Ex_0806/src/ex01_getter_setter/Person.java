package ex01_getter_setter;

public class Person {
	
	//필드에 직접 접근하지 못하도록 private으로 범위를 제한한다.
	private int age;
	
	public void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값으로 설정하세요.");
			return; // 메서드 종료
		} 
		age = num; // age 필드에 num값을 대입한다.
	}
	
	//메서드가 public이면 외부에서 사용 가능. private으로 되어있는 int age필드의 정보를 main에서 대신 반환받아줄 수 있다.
	public int getAge() {
		return age;
	}
}
