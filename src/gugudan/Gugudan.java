package gugudan;

import java.util.Scanner;

public class Gugudan {
	
	//method�� �̿��� ������
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
		
//		System.out.printf("���� �Է��Ͻÿ�: ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		// �Է��� number�ܸ� ���
//		if(number < 2 || number > 9) {
//			System.out.println("���� �߸� �Է��߽��ϴ�");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %2d\n", number, i, number*i);
//			}
//		}
		
//		// 2~9�� (����)
//		for(int i = 1; i < 10; i++) {
//			for(int j = 2; j <10; j++) {
//				System.out.printf("%d * %d = %2d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
		
//		// 2~9�� (����)
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
