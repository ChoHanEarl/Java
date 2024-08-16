package ex02_Thread;

import java.util.Random;

public class QuizThread extends Thread{
	private int time;
//	private int ;

	public void startGame(int time) {
		this.time = time;
		int[] rd = new int[1];
		
		
		for(int i = 0; i <= rd.length; i++) {
			rd[i] = new Random().nextInt(100) + 1;
		}
		System.out.printf("%d + %d = ");
		
		
		
	}
	
	@Override
	public void run() {
		
	}
}
