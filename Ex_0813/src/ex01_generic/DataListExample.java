package ex01_generic;

public class DataListExample {
	public static void main(String[] args) {
		// DataList객체생성 변수명은 list
//		DataList list = new DataList();
		
		//제네릭타입은 기본자료형을 인식하지 않는다.
		//따라서 int, double등의 기본자료형을 제네릭타입으로 이용하려면
		//Integer, Double 등의 Wrapper클래스를 이용해야 한다.
		
		//정수만 받을 수 있는 객체 생성
		DataList<Integer> list = new DataList<Integer>();
		
		// 정수입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// 문자열 저장
//		list.add("문자열");

		// 실수저장
//		list.add(13.45);
		
		// 문자형 저장
//		list.add('B');

		// 최상위 클래스인 Object로 저장이 되기 때문에
		// 타입이 모두 달라도 에러가 뜨지 않는다.

		// 데이터 출력
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
//			Object data = list.get(i);
//
//			// 저장된 타입이 어떤 타입인지 검사
//			if (data instanceof Integer) {
//				System.out.println("정수 : " + (int) data);
//			} else if (data instanceof Double) {
//				System.out.println("실수 : " + (double) data);
//			} else if (data instanceof String) {
//				System.out.println("문자열 : " + (String) data);
//			} else if (data instanceof Character) {
//				System.out.println("문자형 : " + (char)data);
//			}

//			System.out.println(list.get(i));
		}
		System.out.println("총합 : " + sum);

	}
}
