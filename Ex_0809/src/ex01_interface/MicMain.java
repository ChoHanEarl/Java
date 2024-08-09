package ex01_interface;

public class MicMain {
	public static void main(String[] args) {
		System.out.println("---Tjmic 객체---");
		Tjmic tj = new Tjmic();
		tj.connect();
		tj.sing();
		tj.music();
		
		System.out.println("---Tjmic객체를 BluetoothMic로 타입 변환---");
		BluetoothMic bm = tj;
		bm.connect();
		bm.sing();
		bm.music();
		
		System.out.println("---Tjmic객체를 MicroPhone타입으로 변환---");
		MicroPhone mp = tj;
		mp.sing();
//		mp.music();
//		mp.connect();
		
		System.out.println("---Tjmic객체를 Speaker타입으로 변환---");
		Speaker s = tj;
		s.music();
//		s.sing();
//		s.connect();
		
		
		
	}
}
