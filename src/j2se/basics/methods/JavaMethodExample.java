package j2se.basics.methods;

public class JavaMethodExample {

	public static void main(String[] args) {
		int a=5,b=7;
		int res;
		res = add(a,b);
		System.out.println("Sum: "+res);
		diff(a,b);
		float p = pi();
		System.out.println("pi: "+p);
		greet();
		
		

	}
	

	 static void greet() {
		System.out.println("Hello Friends!");
		
	}

	 static float pi() {
		
		return 3.1415f;
	}

	 static void diff(int a, int b) {
		int d;
		if(a>b){
			d=a-b;
		}
		else {
			
			d= b-a;
		}
		System.out.println("Different: "+d);
		
		
	}

	 static int add(int a, int b) {
		int c = a+b;
		return c;
	}

}
