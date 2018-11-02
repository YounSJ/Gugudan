package gugudan;

//Gugudan Class를 이용하여 출력
public class GugudanMain {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = Gugudan.caculate(i);
			Gugudan.print(result);
		}
	}
}
