import java.util.Scanner;

public class Codeforces376_2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		int res = 0;
		int next;
		int cur = 'a';
		for (int i = 0; i<s.length(); i++){
			next = s.charAt(i);
			int diff;
			if((diff=Math.abs(next - cur))>13){
				res += 26-diff;
			}else{
				res+=diff;
			}
			cur = next;
		}
		System.out.println(res);
	}

}
