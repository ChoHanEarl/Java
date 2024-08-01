package ex02_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("-----------------------");
		//1 2 3 4 5 6 7 8 9 10
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		//10 9 8 7 6 5 4 3 2 1
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		//1~20까지 홀수만 가로로 출력하기
		
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i < 20; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		//1 ~ 10까지 3의 배수만 출력하는 코드 작성하기
		for(int i = 3; i <= 10; i += 3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		//1부터 10까지 총합 구하기
		//총 합은 한번만 출력하세요!
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("--------------------");
		
		//정수형 변수 dan에 2~9사이의 값으로 초기화 하고
		//해당 dan에 해당하는 구구단 출력하기
		//2 x 1 = 2
		//2 x 2 = 4
		//2 x 3 = 6
		// ...
		//2 x 9 = 18
		int dan = 2;
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan*i));
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		//키보드에서 정수를 하나 입력받아
		//1부터 입력받은 수 까지의 총합을 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
		
		System.out.println();
		System.out.println("-----------------");
		
		//10개의 정수를 입력받아 그 중에 짝수가 몇개인지
		//개수를 출력해주세요
		
		
//		int jjack = 0;
//		for(int i = 1; i <= 10; i++) {
//			System.out.print("정수 : ");
//			int num2 = sc.nextInt();
//			if(num2 % 2 == 0) {
//				jjack++;
//			}
//		}
//		System.out.println("짝수의 개수 : " + jjack);
		
		System.out.println();
		System.out.println("----------------------");
		
		//키보드로부터 정수를 두 개 입력받는다.
		//입력받은 x부터 y까지의 총합을 출력하세요.
		//예를 들어 2와 5를 입력받으면
		//2 + 3 + 4 + 5를 한 14가 출력이 되어야 한다.
		//단, x가 y보다 큰 경우
		//x와 y의 값을 바꿔서 총합을 구한다.
		
		System.out.print("x값 : ");
		int x = sc.nextInt();
		System.out.print("y값 : ");
		int y = sc.nextInt();
		
		if(x > y) {
			int z = x;
			x = y;
			y = z;
		}
		
		sum = 0;
		for(int i = x; i <= y; i++) {			
			 sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 총합 : %d", x, y, sum);
		
		
		
		
		
	}
}
