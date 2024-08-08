package ex05_abstract;

public class RecipeMain {
	public static void main(String[] args) {
		//추상클래스는 직접 객체를 생성할 수 없다.
		//Recipe r = new Recipe();
		
		PastaRecipe pr = new PastaRecipe("최현석");
		pr.info(); //자식객체를 통해 추상클래스의 메서드를 호출할 수 있다.
		pr.makeSauce();
		
		SteakRecipe sr = new SteakRecipe("이연복");
		sr.info();
		sr.grillSteak();
	}
}
