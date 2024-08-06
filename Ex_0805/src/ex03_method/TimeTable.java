package ex03_method;

public class TimeTable {
	
	//매개변수로 단을 전달받는다.
	public void showTable(int dan) {
		System.out.println(dan + "단");
		//구구단을 구하는 코드
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan*i));
		}
		
	}
	
}
