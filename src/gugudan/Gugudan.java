package gugudan;

import java.util.Scanner;

public class Gugudan {
	
	//method를 이용한 구구단
	public static int[] caculate(int times) {
		int result[] = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		
//		System.out.printf("값을 입력하시오: ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		// 입력한 number단만 출력
//		if(number < 2 || number > 9) {
//			System.out.println("값을 잘못 입력했습니다");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %2d\n", number, i, number*i);
//			}
//		}
		
//		// 2~9단 (가로)
//		for(int i = 1; i < 10; i++) {
//			for(int j = 2; j <10; j++) {
//				System.out.printf("%d * %d = %2d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
		
//		// 2~9단 (세로)
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j <10; j++) {
//				System.out.printf("%d * %d = %2d\n", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
		for(int i = 2; i < 10; i++) {
			int[] result = caculate(i);
			print(result);
			System.out.println();
		}
	}
}
