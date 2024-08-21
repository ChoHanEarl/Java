package ex05;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex03_Stream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 5); // [1,2,3,4] 범위 생성, 마지막숫자 제외
		LongStream longStream = LongStream.rangeClosed(1, 5); //[1,2,3,4,5] 범위생성, 마지막숫자 포함
		
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		//boxed() : int -> Integer로 만드는 것. 
		//int는 기본자료형이라 제네릭에 담을 수 없고 Integer는 클래스이기 때문에 제네릭에 담을 수 있음
		//이처럼 강제로 바꾸어야 하는 상황이 생길 때 사용한다.
	}
}
