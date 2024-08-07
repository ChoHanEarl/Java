package ex03_access;

import ex02_modifier.Parent;

public class NotChild {
	void accessTest() {
		Parent p2 = new Parent();
//		p2.accessProtected(); 상속관계가 아니기 때문에 super도 사용 불가. 즉 호출할 방법이 없다.
	}
}
