import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise5 {
	interface MyInterface<T> {
		public T fun(T x);
	}

	public Long factorial(Long input) {
		long result = 2;
		for (long i = 3; i <= input; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Excercise5 exe = new Excercise5();

		MyInterface<Long> ob = exe::factorial;

		System.out.println("Enter Input for factorial : ");
		try {
			long input = Long.parseLong(br.readLine());

			System.out.println("Factorial of " + input + " = " + ob.fun(input));

			;
		} catch (IOException | NumberFormatException e) {
			System.out.println("Wrong input given");
		}

	}
}
