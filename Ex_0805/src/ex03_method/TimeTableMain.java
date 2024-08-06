package ex03_method;

import java.util.Scanner;

public class TimeTableMain {
	public static void main(String[] args) {
		//TimeTable 객체 생성
		TimeTable tt = new TimeTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		tt.showTable(num);
		

	}
}
