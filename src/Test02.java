import java.util.Scanner;
import java.util.Arrays;

public class Test02 {
	public static int add(int a, int b) {
		return a + b;

	}

	public static int sub(int a, int b) {

		return a - b;
	}

	public static int mul(int a, int b) {

		return a * b;
	}

	public static float div(int a, int b) {

		return a / b;
	}

	public static int mod(int a, int b) {

		return a % b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 3 == 0) {
				cnt++;
			}
		}
		int[] arr_1 = new int[cnt];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				arr_1[j] = arr[i];
				j++;
			}
		}
		System.out.print("arr_1 : ");
		for (int i : arr_1) {
			System.out.print(i + " ");
		}

	}
}
