import java.util.Random;
public class Application {

	public static void main(String[] args) {
		int n = 25;
		int N = 100;
		createUniqueRandomNumbers(n, N);
	}
	
	static void createUniqueRandomNumbers(int numberOfValues, int maxValue) {
		Random rng = new Random();
		int[] A = new int[numberOfValues];
		A[0] = rng.nextInt(maxValue);
		for (int i=1; i<numberOfValues; i++) {
			A = assignRandomValue(A, i);
		}
		
		System.out.print("Array: ");
		for (int a: A) {
			System.out.print(a + " ");
		}
		System.out.print("\n");
	}
	
	static int[] assignRandomValue(int[] A, int i) {
		System.out.println("run " + i);
		Random rng = new Random();
		A[i] = rng.nextInt(100);
		for (int j=0; j<i; j++) {
			if (A[i] == A[j]) {
				System.out.println(i + "=" + j + " -> " + A[i] + "=" + A[j]);
				A = assignRandomValue(A, i);
			}
		}
		return A;
	}
}
