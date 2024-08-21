package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		
		outer:while(true) {
			System.out.print("아이디 생성 : ");
			Scanner sc = new Scanner(System.in);
			UserInfo ui = new UserInfo();
			
			ui.setId(sc.next());

			//ArrayList에 중복되는 아이디가 있는지 검사
			for(int i = 0; i < list.size(); i++) {
				if(ui.getId().equals(list.get(i).getId())) {
					System.out.println("아이디가 중복됩니다. 다른 아이디를 생성하세요.");
					continue outer;
				}
			}
			System.out.print("패스워드 입력 : ");
			ui.setPwd(sc.nextInt());
			
			//리스트에 추가
			list.add(ui);
			
			//list에 들어있는 내용 출력하기
			for(UserInfo u : list) {
				System.out.println(u.getId());
				System.out.println(u.getPwd());
				System.out.println("--------------");
			}
		}
		
		
		
	}
}
