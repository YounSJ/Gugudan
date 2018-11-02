package gugudan;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		
		/*- 연습1 -
		사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다
		예를 들어 사용자가 8을 입력하면 2*1~8*8, 19를 입력하면 2*1~19*19를 계산해 출력
		*/
//		System.out.printf("값 입력: ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//	
//		for(int i = 2; i <= number; i++) {
//			for(int j = 1; j <= number; j++) {
//				System.out.printf("%d * %d = %5d\n", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
		
		/*- 연습2 -
		사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다
		예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다, 팔칠단은 2 * 1, 2 * 7 , ... 8 * 7까지 구현
		*/
		System.out.printf("값 2개 입력(값은 ,로 구분한다): ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine(); //nextLine() → 한 줄 단위로 읽음
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 2; i <= first; i++) {
			for(int j = 1; j <= second; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
