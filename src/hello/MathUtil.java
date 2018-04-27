package hello;

public class MathUtil {
	//methods
	/**
	 * calcule le quotient de deux entiers
	 * @param a dividende
	 * @param b diviseur
	 * @return
	 * @throws Exception si b = 0
	 */
	public static int divide(int a ,int b) throws Exception{
		if (b==0) {
			throw new Exception("b must be != 0");
		}
		return a/b;
		
		
	}
	
}
