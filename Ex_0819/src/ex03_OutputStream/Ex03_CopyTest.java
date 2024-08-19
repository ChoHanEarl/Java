package ex03_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\web0900_CHE\\1. Java/image.jpg");
			out = new FileOutputStream("C:\\web0900_CHE\\1. Java/image_copy.jpg");
			
			byte[] buffer = new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			while((read = in.read(buffer)) != -1) {
				out.write(buffer, 0, read);
			}
			
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end-start)/1000;
			System.out.println(time + "초");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(out != null) {
					out.close();
				}
				
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		//읽자마자 쓰는 것보다 중간에 버퍼라는 공간을 두는 것이 속도가 훨씬 빠르다.
		
		
		
	}
}
