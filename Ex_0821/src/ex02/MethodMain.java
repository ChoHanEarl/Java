package ex02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		// MethodTest 객체생성
		MethodTest mt = new MethodTest();

		// 4번문제 배열
		int[] arr = { 4, 1, 2, 10, 7, 9, 5, 6, 3, 8 };

		// 4번 maxFinder 호출
		mt.maxFinder(arr);

		// 5번문제
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력(1과 2 중 하나) : ");
		int n = sc.nextInt();

		switch (n) {
		case 1 -> mt.fToc();
		case 2 -> mt.cTof();
		}

	}
}
