package ex05_abstract;

public class SteakRecipe extends Recipe{
	public SteakRecipe(String chef) {
		super(chef);
	}
	
	void grillSteak() {
		System.out.println("스테이크를 맛있게 굽습니다.");
	}
}
