public class showLargerExpressionResult{
	public static void main(String args[]) {
		// "!(a + b == c) || ((c != 0) && (b - c >= 19) )" 
		int a = 34;
		int b = 12;
		int c = 8;
		
		boolean firstPart = a+b==c;
		boolean secondPart = !firstPart;
		boolean thirdPart = c!=0;
		boolean fourthPart = b-c>=19;
		boolean fifthPart = thirdPart && fourthPart;
		boolean result = secondPart || fifthPart;
		
		System.out.println("(a + b == c) -> " + firstPart );
		System.out.println("!(a + b == c) -> " + secondPart );
		System.out.println("c!=0 -> " + thirdPart );
		System.out.println("b-c>=19 -> " + fourthPart );
		System.out.println("((c != 0) && (b - c >= 19) ) -> " + fifthPart );
		System.out.println("!(a + b == c) || ((c != 0) && (b - c >= 19) ) -> " + result );
	}
}
