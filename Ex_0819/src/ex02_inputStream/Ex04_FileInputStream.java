package ex02_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		//특정 경로에 file.txt.문서를 만들고 아무 문장이나 입력해둔다.
		//file.txt의 내용을 읽어온 뒤, 회문인지 아닌지 판별해서 출력하시오
		
		String path = "C:\\web0900_CHE\\1. Java/file.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
				
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(read);
				
				String ori = new String(read);
				String rev = "";
//				System.out.println(ori);
				
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}
				
				if(ori.equals(rev)) {
					System.out.println(ori + "은(는) 회문입니다.");
				} else {
					System.out.println(ori + "은(는) 회문이 아닙니다.");
				}
				
			
			} catch (Exception e) {
				
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//finally
		}//if
		
		
		
	}
}
	
