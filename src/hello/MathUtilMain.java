package hello;

public class MathUtilMain {
	public static void main(String[] args) {
		try {
			MathUtil.divide(2, 0);
		} catch (Exception e) {
			System.out.println("Division par zero interdite");
			e.printStackTrace();
		}
	}

}
