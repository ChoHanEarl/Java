package ex04_if;

import java.util.Scanner;

public class Ex02_If_else {
	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num+"은(는) 4보다 큽니다.");
		} else {
			System.out.println(num+"은(는) 4보다 작습니다.");
		}
		//--------------------------------
		//두 개의 숫자 비교하기
		int a = 4;
		int b = 10;
		if(a > b) {
			System.out.println("a는 b보다 큽니다.");
		} else {
			if(a == b) {
				System.out.println("a는 b와 같습니다.");
			} else {
				System.out.println("a는 b보다 작습니다.");
			}
		}
		
		
		System.out.println("---------------------------------");
		
		//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 11;
		if(x > 10 && x < 20) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		char ch = 'x';
		if(ch == 120 || ch == 88) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//char형 변수 ch2가 알파벳(대문자 또는 소문자)일 때 true인 조건식
		char ch2 = 'Z';
		if((ch2 >= 65 && ch2 <= 90)||(ch2 >= 97 && ch2 <= 122)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//삼항연산자로 만들었던 X개의 농구공을 담기위한 박스의 개수 구하기를 조건문으로 만들어 보세요.(공의 개수는 키보드에서 입력받기)
		Scanner sc = new Scanner(System.in);
		System.out.print("공의 개수 : ");
		int ball = sc.nextInt();
		int n = 5;
		int box = 0;
		if(ball % n == 0) {
			box = ball/n;
		} else {
			box = ball/n + 1;
		}
		System.out.println("필요한 박스의 개수 : " + box);
		
	}
}
