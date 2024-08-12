package ex03_String;

import java.util.Scanner;

public class Ex02_String {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열의 소문자a가 몇 개 있는지 판별하는 코드 작성하기
		//결과
		//입력 : asdfasdf
		//a의 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String alphabet = sc.next();
		
		int count = 0;
		for(int i = 0; i < alphabet.length(); i++) {
			if(alphabet.charAt(i) == 'a') {
				count++;
			}
		} 
		System.out.println("a의 개수 : " + count);
		
		
		
		
		
	}
}
