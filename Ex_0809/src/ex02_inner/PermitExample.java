package ex02_inner;

public class PermitExample {
	
	//private으로 된 내부클래스에 접근하는 방법

	private class InClass{
		public void print() {
			System.out.println("접근을 private으로 제한한다.");
		}
	}
	
	public InClass getInClass() {
		return new InClass();
	}
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		permit.getInClass().print();
	}
}
