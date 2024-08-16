package ex02_Thread;

class TimeThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("스레드 출력 : " + (i+1));
			try {
				//1초간 일시정지
				Thread.sleep(1000); // 1000mils -> 1초
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//sleep은 예외처리를 하지 않으면 에러가 발생한다.




public class ThreadSleepExample {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.start();
	}
}
