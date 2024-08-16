package ex02_Thread;

class WhiteFlag implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("백기올려");
		}
	}
}

public class RunnableExample {
	public static void main(String[] args) {
		WhiteFlag wf = new WhiteFlag();
		Thread t = new Thread(wf);
		//백기올려(무한루프) -> 만약 순서대로 진행이 된다면 청기올려는 나올 수가 없다.
		t.start();
		
		//Runnable인터페이스를 익명클래스로 만들어서 람다식으로 표현할 수 있다.
		//이렇게 할 시 따로 클래스를 만들지 않아도 된다.
		Runnable blue = () -> {
			while(true) {
				System.out.println("청기올려");
			}
		};
		
		Thread t2 = new Thread(blue);
		t2.start();
		
	}
}
