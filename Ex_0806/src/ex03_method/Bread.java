package ex03_method;

public class Bread {
	
	int n;
	String bread;
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + n + "개의 빵을 만들었습니다.");
	}
	
	public void makeBread(int n, String bread) {
		for(int i = 0; i < n; i++) {
			System.out.println(bread + "빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n", n, bread);
	}
}
