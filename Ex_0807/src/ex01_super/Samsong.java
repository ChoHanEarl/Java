package ex01_super;

public class Samsong extends Computer{
	
	//오버라이드		오버로드
	// 재정의			중복정의
	
	@Override
	void powerOn() {
		//같은 메서드이지만 자식 클래스의 상황에 맞게 재정의 하는것
		super.powerOn(); // 부모클래스(Computer)의 메서드를 호출
		System.out.println("아이 러브 샘송");
	}
	
	
}
