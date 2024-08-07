package ex01_super;

public class SuperMain {
	public static void main(String[] args) {
		Child c = new Child(1);
		//Child 클래스에는 아무것도 안 적고 자식객체를 생성 후 실행했는데
		//부모생성자 안에 있는 명령이 실행이 됨
		
		//즉 부모생성자가 실행이 됐다는 의미이다.
		
		//부모객체가 만들어지면서, 자식객체가 부모의 필드를 사용할 수 있다.
		System.out.println("money : " + c.money);
	}
}
