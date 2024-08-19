package ex01_file;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		// aaa, bbb의 경우 실제 있는 경로가 아님
		String path = "C:\\web0900_CHE\\1. Java/aaa/bbb";
		
		File f = new File(path);
		
		//최종목적지가 파일이든 폴더이든 아예 존재하지 않는다.
		//exists() -> 최종 목적지까지 가는 길에 없으면 false
		if(!f.exists()) {
			System.out.println("폴더생성");
			//mkdir() -> 한개의 폴더를 만들어주는 메서드(여러개는 안됨)
			//mkdirs() -> 복수의 폴더를 만들어주는 메서드(한 개도 가능)
			f.mkdirs();
		}
		
		//File 클래스의 세 번째 기능
		//목적지까지 경로가 존재하는지 파악가능
		//폴더를 만드는 것이 가능하다.
		
		//File 클래스는 특정 문서를 만드는 기능은 없다.
		//폴더를 만드는 것 까지만 가능하다.
		
		//File 클래스의 역할
		//경로의 검증(존재하냐 존재하지 않냐, 파일이냐, 폴더냐, 파일의 이름 가져오기)
		
		
		
	}
}
