/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for the expressions
	1. 8   True
	2. 11  True
	3. 12  True
	4. 4   True
	5. 3   False. I evaluated in the wrong order
	6. 11  True
	7. "2 + 2" + 7   False. I did not concatinate the numbers together   
	8. 7 + " 2 + 2"  False. I did not concatinate the numbers together
 
 	After testing the expressions in the main method, indicate above if your predictions were correct.
*/

public class TestExpressions {

	public static void main(String[] args) {
		System.out.println(3 + 4 + " 2 + 2");
	}

}
