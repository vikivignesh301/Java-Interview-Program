package Pyramid1;

public class Type9 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1, p = 0; i <= n; i++, p+=2) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}

}
