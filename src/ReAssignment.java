/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for variables a, b, and c
	a => 6  True
	b => 9  True
	c => 15 False. I evaluated c as if a had already been computed.
 
 	After testing the statements in the main method, indicate above if your predictions were correct.
*/

public class ReAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = b;
		a = a + 1;
		b = b - 1;
		c = c + a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
