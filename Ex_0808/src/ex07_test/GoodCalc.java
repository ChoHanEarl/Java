package ex07_test;

public class GoodCalc extends Calculator{
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public int substract(int x, int y) {
		return x - y;
	}
	
	@Override
	public double average(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		double avg = (double)sum/arr.length;
		return avg;
	}
	
}
