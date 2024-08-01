package ex04_if;

import java.util.Scanner;

public class Ex04_if_elseif {
	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		
		System.out.println("--------------------------");
		//나이를 키보드에서 입력받는다.
		//20살 이상이면 성인입니다.
		//14살 이상이면 청소년입니다.
		//7살 이상이면 어린이입니다.
		//그 이외에는 유아입니다.
		//라고 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
				//객체명.메서드명(); -> 해당 클래스에 있는 메서드의 호출
		if(age > 19) {
			System.out.println("성인입니다.");
		} else if(age > 13) {
			System.out.println("청소년입니다.");
		} else if(age > 6) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("유아입니다.");
		}
		
		System.out.println("---------------------");
		//키보드에서 성적을 입력받는다.
		// 100 ~ 90 A
		// 89 ~ 80 B
		// 79 ~ 70 C
		// 69 ~ 60 D
		// 59 ~ 0 F
		//출력하기 "점수는 X점이고 성적은 X입니다."
		
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'a';
		if(score <= 100 && score >= 90) {
			grade = 'A';
		} else if(score >= 80 && score >= 89) {
			grade = 'B';
		} else if(score >= 70 && score >= 79) {
			grade = 'C';
		} else if(score >= 60 && score <= 69) {
			grade = 'D';
		} else if(score >= 0 && score <= 59) {
			grade = 'F';
		} else {
			System.out.println("입력값이 올바르지 않습니다.");
		}
		
		System.out.printf("점수는 %d점이고 성적은 %c입니다.",score,grade);
		
		
		
	}
}
