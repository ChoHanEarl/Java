package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
	    Random rnd = new Random();
	    int rnum = rnd.nextInt(500)+1;
	    rnum *= 10;
	    
	    System.out.println(rnum+"원");
	    
	    int[] money = {500,100,50,10};
	    int count = 0;
	    
	    for(int i = 0; i < money.length; i++) {
	    	count = rnum / money[i];
	    	System.out.println(money[i] + "원 : " + count + "개");
	    	rnum %= money[i];
	    }
	    
	}
}
