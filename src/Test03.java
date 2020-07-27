import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {

		int[] score = { 100, 50, 20, 87, 89, 56 };
		int[] scoreCopy = Arrays.copyOf(score, score.length);
		int[] scoreCopy_1 = Arrays.copyOf(score, 3);
		int[] scoreCopy_2 = Arrays.copyOf(score, 10);

		scoreCopy[0] = 0;
		scoreCopy[1] = 0;

		System.out.print("score : ");
		for (int i : score) {
			System.out.print(i + " ");
		}
		System.out.print("\nscoreCopy : ");
		for (int i : scoreCopy) {
			System.out.print(i + " ");
		}
		System.out.print("\nscoreCopy_1 : ");
		for (int i : scoreCopy_1) {
			System.out.print(i + " ");
		}
		System.out.print("\nscoreCopy_2 : ");
		for (int i : scoreCopy_2) {
			System.out.print(i + " ");
		}

	}

}
