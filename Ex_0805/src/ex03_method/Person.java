package ex03_method;

public class Person {
	//이름과 나이를 전달받아 출력하는 introduce메서드 생성하기
	//결과
	//제 이름은 XXX이고, 나이는 X세입니다.
	//PersonMain에서 메서드 호출하기
	
	public void introduce(String name, int age) {
		System.out.printf("제 이름은 %s이고, 나이는 %d세입니다.\n", name, age);
	}
	
	
}
