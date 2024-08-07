package ex01_super;
//상속을 이용해서 다음 클래스들을 간결한 구조로 만드세요.
//부모 -> 넓은 범위의 개념, 자식 -> 좁은 범위의 개념

class Pen {
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}

}



class SharpPencil extends Pen{ //샤프펜
	private int width; //펜의 굵기
//	private int amount; //남은 량
//	public int getAmount() {return amount;}
//	public void setAmount(int amount) {this.amount = amount;}
}

class Ballpen extends Pen{ //볼펜
//    private int amount; //남은 량
    private String color; //볼펜의 색
//    public int getAmount(){return amount;}
//    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class FountainPen extends Pen{ // 만년필
//    private int amount; //남은 양
//    private String color; //볼펜의 색
//    public int getAmount(){return amount;}
//    public void setAmount(int amount){this.amount = amount;}
//    public String getColor(){return color;}
//    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}

}


class A{
    public A(){System.out.println("A");}
    public A(int x){System.out.println("A: " + x);}
}

class B extends A{
    public B(){super(100);}
    public B(int x){
    	//super(); -> 얘가 생략되어 있다는 점을 인지해야 한다
    	System.out.println("B: "+ x);}
}

//public class Example {
//    public static void main(String[] args){
//        B b = new B(11); // 출력결과 A B: 11
//    }
//}








public class PenMain {

}
