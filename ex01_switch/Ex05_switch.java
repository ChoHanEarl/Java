package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받는다.
		//해당 숫자가 짝수인지 홀수인지 판별하는 코드를
		//switch로 작성해 주세요
		//짝수면 짝수, 홀수면 홀수라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1,3,5,7,9:
			System.out.println("홀수");
			break;
		case 2,4,6,8,10:
			System.out.println("짝수");
			break;
		default:
			System.out.println("유효하지 않은 범위입니다.");
		}
		
		System.out.println("---------------------------");
		
		System.out.print("숫자 : ");
		int num2 = sc.nextInt();
		
		switch(num2) {
		case 1,3,5,7,9 -> System.out.println("홀수");
		case 2,4,6,8,10 -> System.out.println("짝수");
		default -> System.out.println("유효하지 않은 범위입니다.");
		}
		
		System.out.println("----------------------------");
		
		System.out.print("숫자 : ");
		int num3 = sc.nextInt();
		
		switch(num3) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("짝수");
			break;
		default:
			System.out.println("유효하지 않은 범위입니다.");
		}
		
		System.out.println("----------------------");
		// 제한이 없을 경우
		
		System.out.print("숫자: ");
		int num4 = sc.nextInt();
		
		switch(num4 % 2) {
		case 0 -> System.out.println("짝수");
		case 1 -> System.out.println("홀수");
		}
		
		//------------------------------------------------------------
		System.out.println("---------------------------");
		//키보드에서 달(month)를 입력받아
		//해당 달이 몇일까지 있는지 switch문을 이용해 작성해주세요
		//결과
		//X월은 X일까지 있습니다.
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.printf("%d월은 31일까지 있습니다.\n", month);
		case 4,6,9,11 -> System.out.printf("%d월은 30일까지 있습니다.\n", month);
		case 2 -> System.out.printf("%d월은 28일까지 있습니다.\n", month);
		default -> System.out.printf("%d월은 존재하지 않습니다.\n", month);
		}
		
		//--------------------------------------------------
		System.out.println("----------------------");
		//계산기 프로그램 만들기
		//두 개의 정수를 입력받는다.
		//산술연산자도 입력받아서 문자열에 담는다. ex) "+"
		//switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("연산자 : ");
		String calculate = sc.next();
		
//		switch(calculate) {
//		case "+" -> System.out.println(x + " + " + y + " = " + (x + y) );
//		case "-" -> System.out.println(x + " - " + y + " = " + (x - y));
//		case "*" -> System.out.println(x + " * " + y + " = " + (x * y));
//		case "/" -> System.out.println(x + " / " + y + " = " + (x / y));
//		}
		
		switch(calculate) {
		case "+" -> System.out.printf("%d + %d = %d\n", x, y, (x+y));
		case "-" -> System.out.printf("%d - %d = %d\n", x, y, (x-y));
		case "*" -> System.out.printf("%d * %d = %d\n", x, y, (x*y));
		//수학적인 나누기를 하려면 숫자 하나를 double로 형변환을 하면 된다.
		case "/" -> System.out.printf("%d / %d = %f\n", x, y, (double)(x/y));
		
		}
		
		
		
		
		
		
		
	}
}
