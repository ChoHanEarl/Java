package ex05_try_catch;
//키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력되었다면
//"정수만 입력하세요"라는 메세지 출력하기

import java.util.InputMismatchException;
import java.util.Scanner;

//결과
//정수 : 100
//결과 : 100

//정수 : aaa
//정결과 : aaa은(는) 정수가 아닙니다.
public class Ex03_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수 : ");
			int num = sc.nextInt();
//			num = sc.next();
//			int n = Integer.parseInt(num);
			System.out.println("결과 : " + num);			
		} catch (Exception e) {
			String name = sc.nextLine();
			System.out.println(name + "은(는) 정수가 아닙니다.");
		}
	}
	
	
}
