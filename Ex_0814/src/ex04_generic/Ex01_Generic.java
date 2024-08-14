package ex04_generic;

//숫자만 받아 계산하는 계산기 클래스 모듈
class Calculator<T extends Number> {
	void add(T a, T b) {}
	void min(T a, T b) {}
	void mul(T a, T b) {}
	void div(T a, T b) {}
}

public class Ex01_Generic {
	public static void main(String[] args) {
		//제네릭에 아무 타입이나 모두 할당이 가능
		//문법적으로 틀리지는 않았기 때문에 에러는 발생하지 않는다.
		//따라서 extends를 사용하여 타입을 어느정도 제한시킬 수 있다.
		Calculator<Number> cal1 = new Calculator<>();
		Calculator<Integer> cal2 = new Calculator<>();
		Calculator<Double> cal3 = new Calculator<>();
//		Calculator<Object> cal4 = new Calculator<>();
//		Calculator<String> cal5 = new Calculator<>();
//		Calculator<Ex01_Generic> cal6 = new Calculator<>();
		
	}
}
