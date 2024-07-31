package ex03_operator;

import java.util.Scanner;

public class Ex08_Operator {
	public static void main(String[] args) {
		//과수원에서 배, 사과, 오렌지를 하루에 각각 5개, 7개, 5개씩 생산한다
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		int pear = 5, apple = 7, orange = 5;
		int total = pear + apple + orange;
		double avg = (double)total / 24;  
		System.out.println("하루에 생산되는 과일의 총 개수 : " + total);
		System.out.println("시간당 총 생산량 : " + avg);
		
		//-----------------------------------------------
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		//만일 농구공이 23개라면 몇개의 상자가 필요한가?
		
//		int ball = 23;
//		int box = (ball / 5) + 1;
//		System.out.println("필요한 상자의 수 : " + box);
		
//		Scanner sc = new Scanner(System.in);
//		int ball = sc.nextInt();
//		System.out.println("공의 개수 : ");
//		int box = (ball / 5) == 0 ? (ball / 5) : (ball / 5) + 1;		
//		System.out.println("필요한 상자의 수 : " + box);
		
		int ball = 23; // 공의 개수
		int n = 5; //상자에 공을 담을 수 있는 개수
		int result = ball % n == 0 ? ball / n : ball / n + 1;
		System.out.println(result);
		
		//------------------------------------------
		//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균 출력하기(합계 / 3.0)
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격
		//아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total2 = kor+eng+math;
		System.out.printf("1. 합계 : %d\n", total2);
		
		double avg2 = total2 / 3.0;
		System.out.printf("2. 평균 : %f\n", avg2);
		
		String result2 = (kor >= 40 && eng >= 40 && math >= 40 && avg2 >= 60) ? "합격" : "불합격";
		System.out.println(result2);
				
		
		
		
		
		
		
	}
}
