package ex02_map;

import java.util.HashMap;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		//map에 특정 key값이 포함되어있는지 확인하는 메서드
		//containsKey()
		if(map.containsKey("k3")) {
			System.out.println("k3라는 key가 존재합니다.");
		}
		
		//map에 특정 value값이 포함되어있는지 확인하는 메서드
		//containsValue()
		if(map.containsValue(100.0f)) {
			System.out.println("map에 100.0f라는 value가 존재합니다.");
		}
		
	}
}
