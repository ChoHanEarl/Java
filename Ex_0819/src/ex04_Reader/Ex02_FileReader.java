package ex04_Reader;

import java.io.FileReader;

public class Ex02_FileReader {
	public static void main(String[] args) {
		//특정경로에 reader.txt파일을 만들고 아무 내용이나 적는다.
		//reader.txt파일을 읽어서 알파벳 대문자와 소문자의 개수를 출력하세요.
		
		//대문자 : X개
		//소문자 : X개
		
		FileReader fr = null;
		int upper = 0;
		int lower = 0;
		
		try {
			fr = new FileReader("C:\\web0900_CHE\\1. Java/reader.txt");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
				
				if(code >= 65 && code <= 90) {
					upper++;
				} else if(code >= 97 && code <= 122) {
					lower++;
				}
				
			}
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
