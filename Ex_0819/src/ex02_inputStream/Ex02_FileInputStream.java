package ex02_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		String path = "C:\\web0900_CHE\\1. Java/test.txt";
		
		File f = new File(path);
		
		//메모리 낭비 방지를 위해 파일의 크기만큼만 배열의 크기를 만들고 싶다.
		//f.length();
		//length는 반환형이 long이지만 배열에 들어갈 수 있는건 int까지이다. 따라서 형변환 필요
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				//내용을 읽어와서 바이트배열 read에 저장
				fis.read(read);
				
				//현재 byte[]배열 read에는 test.txt에서 읽어온 데이터들이 저장되어 있다.
				//이를 문자열 형태로 재조립하여 출력할 수 있다.
				String res = new String(read);
				System.out.println(res);
				
			} catch (Exception e) {
				
			} finally {
				try {
					//잘 읽어오든, 읽어오지 못하든 무조건 닫아야 함
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
