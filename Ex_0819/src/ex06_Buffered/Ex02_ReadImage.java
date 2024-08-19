package ex06_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_ReadImage {
	public static void main(String[] args) {
		//기반스트림만 사용해서 이미지 읽어보기
		FileInputStream readFile = null;
		
		//기반 + 보조스트림을 사용해서 이미지 읽어보기
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("기본 스트림으로 읽기 시작");
			readFile = new FileInputStream("C:\\web0900_CHE\\1. Java/image.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작 1");
			while((readFile.read()) != -1) {
				//이미지 읽기. 내용은 필요 없고 얼마나 걸리는지만 알면 되기 때문에 따로 내용은 적지 않음
			}
			System.out.println("이미지 읽기 종료 1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println("소요 시간 : " + time + "초");
			System.out.println("기본 스트림으로 읽기 종료");
			
			System.out.println("--------------------------");
			System.out.println("보조 스트림으로 읽기 시작");
			bisReadFile = new FileInputStream("C:\\web0900_CHE\\1. Java/image.jpg");
			bis = new BufferedInputStream(bis);
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작 2");
			while((bisReadFile.read()) != -1) {
				//이미지 읽기. 내용은 필요 없고 얼마나 걸리는지만 알면 되기 때문에 따로 내용은 적지 않음
			}
			System.out.println("이미지 읽기 종료 2");
			end = System.currentTimeMillis();
			double result = (double)(end-start) / 1000;
			System.out.println("소요 시간 : " + result + "초");
			System.out.println("보조 스트림으로 읽기 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {		
				if(bis != null) {
					bis.close();
				}
				
				if(bisReadFile != null) {
					bisReadFile.close();
				}
				
				if(readFile != null) {
					readFile.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
