package ex02_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		System.out.printf("제 나이는 %d세 입니다.\n", age);
		System.out.println("---------------------");
		//제 이름은 XXX입니다.
		//제 나이는 XX살입니다.
		//제 주소는 XXX입니다.
		//제 키는 XX.Xcm입니다.
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int myAge = scan.nextInt();
		//scan.nextLine();
		scan.skip("\r\n"); // \r : 캐리지 리턴
		System.out.print("주소 : ");
		String address = scan.nextLine();
		System.out.print("키 : ");
		float height = scan.nextFloat();
		
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 나이는 %d입니다.\n", myAge);
		System.out.printf("제 주소는 %s입니다.\n", address);
		System.out.printf("제 키는 %.1fcm입니다.\n", height);
		
		
		
	}
}
