package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTest {
	//4번 문제 maxFinder 메서드
	public void maxFinder(int[] arr) {
		int max = arr[0];
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("4번 결과");
		System.out.println("배열 arr의 최대값 : " + max);
		System.out.println("----------------------");
	}
	
	//5번 문제
	Scanner sc = new Scanner(System.in);
	
	
	//5번 문제 fToc 메서드
	public void fToc() {
		System.out.print("화씨온도 : ");
		double f = sc.nextDouble();
		double res1 = (f-32)/1.8; 
		System.out.printf("화씨가 %.1f도일 때 섭씨 : %.1f\n", f, res1);
	}
	
	//5번 문제 cTof 메서드
	public void cTof() {
		System.out.print("섭씨온도 : ");
		double c = sc.nextDouble();
		double res2 = 1.8*c+32;
		System.out.printf("섭씨가 %.1f도일 때 화씨 : %.1f\n", c, res2);
	}
}
