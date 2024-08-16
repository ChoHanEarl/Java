package ex01_lamda;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Ex03_lamda {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5"));
		System.out.println(list);
		
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//void accept(T t)를 매개변수로 받을 수 있다.
		//이를 람다식으로 고쳐보면 (T t) -> {}
		//t -> {} -> void이기 때문에 중괄호 생략 가능
		//t -> System.out.println(t);
		//System.out::println
		list.forEach(System.out::print);
		System.out.println();
		//똑같이 출력하고 싶다면
		list.forEach(t -> System.out.print(t + " "));
		System.out.println();
		
		//또 다른 방법
		Consumer<String> print = t -> System.out.print(t + " ");
		list.forEach(print);
		
	}
}
