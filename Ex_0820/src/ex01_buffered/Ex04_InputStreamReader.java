package ex01_buffered;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("C:\\web0900_CHE\\1. Java/test.txt");
			is = new InputStreamReader(in, "UTF-8"); //인코딩 타입(UTF-8, ANSI 등)도 결정할 수 있다.
			int read = 0;
			
			while((read = is.read()) != -1) {
				System.out.print((char)read);
			}
			
			//예외가 발생했을 경우 바로 catch로 넘어가기 때문에 close()가 안되는 경우가 생길 수 있다.
			//따라서 웬만하면 finally에 close()를 정의하는 것이 좋다.
//			is.close();
//			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(is != null) is.close();
				if(in != null) in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
