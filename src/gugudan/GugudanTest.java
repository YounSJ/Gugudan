package gugudan;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		
		/*- ����1 -
		����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�
		���� ��� ����ڰ� 8�� �Է��ϸ� 2*1~8*8, 19�� �Է��ϸ� 2*1~19*19�� ����� ���
		*/
//		System.out.printf("�� �Է�: ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//	
//		for(int i = 2; i <= number; i++) {
//			for(int j = 1; j <= number; j++) {
//				System.out.printf("%d * %d = %5d\n", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
		
		/*- ����2 -
		����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�
		���� ��� ����ڰ� "8,7"�� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�, ��ĥ���� 2 * 1, 2 * 7 , ... 8 * 7���� ����
		*/
		System.out.printf("�� 2�� �Է�(���� ,�� �����Ѵ�): ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine(); //nextLine() �� �� �� ������ ����
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
