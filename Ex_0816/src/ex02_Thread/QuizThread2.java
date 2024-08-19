package ex02_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread2 extends Thread{

	//난수를 받기 위한 변수
	int su1, su2;
	//시간을 세서 담기 위한 변수
	int timer = 0;
	//정답을 맞춘 횟수를 저장하기 위한 변수
	int playCount = 0;
	//반복문을 멈추기 위한 변수
	boolean isCheck = true;
	//맞춰야 하는 문제의 개수
	//final -> 상수
	//값을 다시 대입하는 것이 불가능
	final int FINISH = 5; 
	
	//난수를 두 개 뽑고, 두 수의 합을 맞추는 게임기능 만들기
	//5번 맞추면 게임 종료
	
	public void startGame() {
		while(isCheck) {
			try {
				//난수 두 개 받기
				su1 = new Random().nextInt(100)+1;
				su2 = new Random().nextInt(100)+1;
				
				//두 개의 난수를 더하는 문제를 콘솔에 출력하기
				System.out.printf("%d + %d = ", su1, su2);
				
				//정답 입력받기
				Scanner sc = new Scanner(System.in);
				//정답을 입력할 때 정수 이외의 것을 입력하면 예외 발생
				int result = sc.nextInt();
				
				if(result == (su1 + su2)) {
					System.out.println("정답!");
				} else {
					System.out.println("오답!");
					continue;
				}
				
				//정답을 맞추면 카운트하기
				playCount++;
				
				//5개를 맞추면 멈추기
				if(playCount == FINISH) {
					System.out.println("결과 : " + timer + "초");
					//isCheck를 false로 바꿔 반복문을 빠져나간다.
					isCheck = false;
				}
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요");
			}
		}//while
	}//startGame()
	
	//시간초를 세기 위한 스레드
	//startGame()메서드가 실행되는 동안 별도로 작동하는 스레드
	@Override
	public void run() {
		//isCheck가 false가 되는 순간 반복문이 같이 멈춘다.
		while(isCheck) {
			try {
				//1초씩 세야 하기 때문에 sleep 사용
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
}
