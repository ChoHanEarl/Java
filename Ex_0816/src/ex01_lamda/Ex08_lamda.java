package ex01_lamda;

@FunctionalInterface
interface IAdd{
	int add(int x, int y);
}

class MathUtils {
	public static int AddElement(int x, int y) {
		return x + y;
	}
}

public class Ex08_lamda {
	public static void main(String[] args) {
		//IAdd addLamda = (x,y) -> MathUtils.AddElement(x, y);
		IAdd addLamda = MathUtils::AddElement; // 위와 같은 의미
		System.out.println(addLamda.add(10, 20));
	}
}
