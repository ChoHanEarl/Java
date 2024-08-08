package ex07_test;

public class CalMain {
	public static void main(String[] args) {
		Calculator calc = new GoodCalc();
		System.out.println("합: " + calc.add(10, 10));
		System.out.println("차: " + calc.substract(10, 10));
		int[] arr = {1,2,3,4,5};
		System.out.printf("평균 : %.2f\n", calc.average(arr));

	}
}
