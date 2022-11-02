
public class Ass3_Part3 {
	public static Boolean balanced(String equ) {
		
		int lefts = 0;
		int rights = 0;
		
		for (int i = 0; i < equ.length(); i++) {
		
			if (equ.charAt(i) == '(')
				lefts++;
			
			if (equ.charAt(i) == ')') {
				rights++; }
				}
		
	if (lefts == rights)
            return true;
        else
            return false;
	}
}
