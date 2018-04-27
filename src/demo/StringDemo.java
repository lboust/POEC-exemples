package demo;

public class StringDemo {

	public static void main(String[] args) {
		String s = "bonjour";
		// syntaxe alternative String s2 = new String("bonjour");
		System.out.println(s.isEmpty());
		
		String result = "bonjour"+"le"+"monde";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("bonjour");
		sb.append(" ");
		sb.append("le");
		sb.append(" ");
		sb.append("monde");
		//sb.reverse();
		
		System.out.println(sb);
		
		int a = 3;
		int b = 4;
		System.out.println(a == b);
		
		// avec constructeur
		String s1 = new String("bonjour");
		String s2 = new String ("bonjour");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		// sans constructeur
		String s3 = "bonjour";
		String s4 = "bonjour";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		String who = "toi";
		System.out.format("bonjour %s %s", who, "comment ça va?");
		System.out.println();
		System.out.format("%n");
		double nb = 5.123456789;
		
		System.out.format("nombre : %.2f", nb);

	}

}
