package ex02_Thread;

class AddThread implements Runnable {

	private Bank b;
	private String name;

	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}

	@Override
	public void run() {
		synchronized (b) {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000); // 1초동안 멈춤
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
				}//for문 끝
			} catch (Exception e) {

			}//catch 끝
		}//b;
	}

}//Runnable 끝

public class BankThreadExample {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(new AddThread("1번", b));
		Thread t2 = new Thread(new AddThread("2번", b)); // 2개의 스레드에서 같은 객체(b)를 참조
		t1.start();
		t2.start();
		// 실행하면 값의 손실 발생 가능성이 있음(날 수도 있고 안날 수도 있음)
		// 최종적으로 2만원이 나와야 정상이다. 그런데 2만원이 안나오는 경우가 있다. 하지만 은행의 경우 약간의 오류라도 발생해선 안된다.
		// 실행 결과에 따라 2만원이 아닌 더 적은 금액이 나올 수 있는 이유는
		// 두 개의 스레드가 서로의 작업에 간섭하여 정상적으로 입금되지 않았기 때문이다.
		// 이러한 오류를 방지하기 위해 여러 스레드가 하나의 공유 데이터에 동시에 접근하지 못하도록 스레드의 실행을 제어하는 '스레드 동기화'가
		// 필요하다.

	}
}
