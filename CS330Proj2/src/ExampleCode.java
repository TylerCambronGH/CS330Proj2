import java.security.SecureRandom;

public class ExampleCode {

	static int[] createUniqueRandomNumbers(int from, int to) {
		int n = to - from + 1;
		int[] a = new int[n];
		for(int i = 1; i <= n; i++)
		{
		    a[i - 1] = i;
		}

		// an array to store the result
		int[] result = new int[n];

		SecureRandom rd = new SecureRandom();
		int x = n;
		for(int i = 1; i <= n; i++)

		{
		    // k is a random index in [0, x]
			System.out.println(x);
		    int k = rd.nextInt(x);

		    result[i - 1] = a[k];

		    a[k] = a[x - 1];

		    x--;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] result = createUniqueRandomNumbers(1, 25);
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
			for (int j=i+1; j<result.length-i; j++) {
				if (result[i] == result[j]) {
					System.out.println(result[i] + "=" + result[j]);
				}
			}
		}
	}

}
