package ex03_array;

import java.util.Scanner;

public class Ex10_multi_array {
	public static void main(String[] args) {
		//1에서 25까지 2차원 배열 arr에 순차적으로 넣고
		//한 줄에 5개씩 출력하기
		
		//01 02 03 04 05
		//06 07 08 09 10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
		
		int arr[][] = new int[5][5];
		int count = 1;
//		int[][] arr = {01,02,03,04,05},{06,07,08,09,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25};
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j] = count++);
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		//로또번호 맞추기
		int[][] lotto = {{2,6,11,33,42,44},
						{1,6,17,22,24,33},
						{7,16,24,33,45,9}, 
						{27,42,35,21,45,3},
						{6,17,22,24,33,41}};
		
		//키보드에서 당첨 숫자를 연속으로 6개를 입력받아 myNum에 넣는다.
		Scanner sc = new Scanner(System.in);
		

		String myNum = "";
		
		boolean isWin = false;
		
		System.out.print("숫자 6개 입력 : ");
		myNum = sc.next();
		
		//2차원배열에 들어있는 1차원배열 5개 중 하나라도 완전히 일치하는 것이 있으면 당첨!
		//아니면 당첨되지 못했습니다 출력
		//문자열끼리 비교하려면 equals라는 메서드를 활용
		//myNum.equals();
		
		for(int i = 0; i < lotto.length; i++) {
			String lottoNumber = "";
			//하나의 일차원배열에 있는 숫자들을 문자열로 붙인다.
			for(int j = 0; j < lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
			}
			
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
		}
		
		if(isWin) {
			System.out.println(myNum + "번호 당첨");
		} else {
			System.out.println(myNum + "번호는 당첨되지 못했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
