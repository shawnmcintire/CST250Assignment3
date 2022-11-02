import java.util.Stack;

public class Ass3_Part2 {
	public static Boolean palindrome(String str) {
		Stack<Character> strRev = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			strRev.push(str.charAt(i));
		}
		
		String strRevStr = "";
		
		while (!strRev.isEmpty()) {
			strRevStr += strRev.pop();
		}
		
		if (str.equals(strRevStr))
            return true;
        else
            return false;
	}
}
