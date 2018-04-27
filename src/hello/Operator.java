package hello;

public class Operator {

	public static void main(String[] args) {
		// modulo
		System.out.println( 4 % 2);
		//opérateur avec une opérande
		int i = 10;
		int a = 0;
		/*i++;
		++i;
		System.out.println(i);
		i--;
		--i;
		System.out.println(i);*/
		a=i++; //post incrémentation dangereuse
		System.out.println(i);
		System.out.println(a);
		a=++i;
		System.out.println(i);
		System.out.println(a);
		a+=10;
		System.out.println(a);
		//opérateurs booleens
		System.out.println(5==5.0f);
		System.out.println(97=='a');
		System.out.println(1<2); //etc. > <= >= !=
		
		
		int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);

	}

}
