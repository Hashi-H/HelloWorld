
public class Operators_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		// example practices run to understand 
		//  when confused
		 int a = 20;
		 int b = 10;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		// when using these operators they only work 
		// with int, double, float
		
		boolean b1 = a > b;
		boolean b2 = a < b;
		boolean b3 = a >= b;
		boolean b4 = a <= b;
		boolean b5 = a == b;
		boolean b6 = a != b;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        
        int a1 = 5;
        int b11 = 3;
        
        int bitwiseAnd = a1 & b11;
        int bitewiseOr = a1 | b11;
        int bitewiseXor = a1 ^ b11;
        int bitewiseRightShift = a1 >> b11;
		int bitewiseLeftShift = a1 << b11;
		
		System.out.println(bitwiseAnd);
		System.out.println(bitewiseOr);
		System.out.println(bitewiseXor);
		System.out.println(bitewiseRightShift);
		System.out.println(bitewiseLeftShift);
		
       
		
		
	
		
		
		
        
	}

}
