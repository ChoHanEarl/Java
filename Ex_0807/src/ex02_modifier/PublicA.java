package ex02_modifier;

public class PublicA {
	public int a;
	
	public PublicA(int a) {
		this.a = a;
	}
	
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드 호출");
	}
	
	//같은 패키지이기 때문에 객체 생성이 가능하다.
	DefaultC dc = new DefaultC();
	
	void methodA() {
		dc.variableC = 20; // public으로 선언된 필드이기 때문에 사용 가능
	}
	
}
