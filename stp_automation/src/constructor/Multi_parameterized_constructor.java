package constructor;

public class Multi_parameterized_constructor {

	public Multi_parameterized_constructor(int a ,float b) {
		this(7,4.5);
		System.out.println(+a+" "+b);
	}
	
public Multi_parameterized_constructor(int v ,String x) {
	this();
	System.out.println(+v+" "+x);
	}

public Multi_parameterized_constructor(int b ,double k) {
	this(90,"manual");
	System.out.println(+b+" "+k);
}

public Multi_parameterized_constructor() {
	System.out.println("user_define_constructor");
}
	
	public static void main(String[] args) {

		Multi_parameterized_constructor mp = new Multi_parameterized_constructor (8,5.5f);
		
//		whose object is created this will call lastly
	}

}
