package Ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		Calplus cp = new Calplus();
		System.out.println("CalPlus : " + cp.getResult(10, 20));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(20, 5));
	}
}
