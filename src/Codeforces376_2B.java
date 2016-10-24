import java.util.Scanner;

public class Codeforces376_2B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] s = in.nextLine().split(" ");
		in.close();
		int[] arr = new int[n];
		boolean b = true;
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		if (n == 1) {
			if (arr[0] % 2 == 0) {
				System.out.println("YES");
				return;
			} else {
				System.out.println("NO");
				return;
			}
		}
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 1) {
					while (arr[++i] % 2 == 0 && arr[i] > 0) {

					}
					if (arr[i] == 0) {
						b = false;
						break;
					}

				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("NO");
			return;
		}
		if (b)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
