package ex01_buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex07_sum {
	public static void main(String[] args) throws Exception{
		//문제
		//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요.
		
		//입력
		//N개의 숫자를 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		
		//출력
		//입력으로 주어진 숫자 N개의 합을 출력
		
		//예시
		//1
		//1
		//결과
		//1
		
		//5
		//54321
		//결과
		//15
		
		//25
		//700000 ... 0 (0 24개)
		//결과
		//7
		
		//11
		//10987654321
		//결과
		//46
		
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		int n = Integer.parseInt(buffer.readLine());
		int sum = 0;
		
		//입력받은 문자열을 미리 배열에 넣어놓는다.
		String[] arr = buffer.readLine().split("");
		
		//내가 입력받은 숫자만큼만 반복
		for(int i = 0; i < n; i++) {
			//입력받은만큼만 더함
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println("총합 : " + sum);
		

		
		
	}
}
