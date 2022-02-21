
import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class m{
    static char letter;

	static int weight;

	static void setLetter(char let) {
		letter = let;
		weight = let - 96;
	}

	public static BitSet buildBitSet(String s) {

		BitSet bs = new BitSet();

		setLetter(s.charAt(0));
		bs.set(weight);

		for (int i = 1; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == letter) {
				weight += (letter - 96);
				bs.set(weight);
			} else {
				setLetter(cur);
				bs.set(weight);
			}
		}

		return bs;
	}

	public static void main(String[] args) {

		BitSet bs = null;
		int[] a = null;
		try (Scanner in = new Scanner(System.in);) {
			bs = buildBitSet(in.next());
			int n = in.nextInt();

			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			if(bs.get(a[i])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}
}