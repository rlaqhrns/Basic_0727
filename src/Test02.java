import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() * 5;

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		sc.close();
	}
}
