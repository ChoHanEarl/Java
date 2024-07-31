package ex04_if;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {
		int result = 0;
		if(3 > 2) {
			result = 3;
			//int n = 10;
		}
		System.out.println(result);
		//System.out.println(n); (에러)
		//n이라는 변수는 if문 내에서 만들어진 변수이기 때문에 바깥에서는 사용할 수 없다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");
		} 
		
		
	}
}
