class A{
	int x=10;
	A(int a){
		this();
		System.out.println("Hello User ! I Will Execute Second ");
	}
	A(){
		System.out.println("Hello User ! I Will Execute First ");
	}
}

class B extends A{
	int y = 20;
	B() { 
	   super(5);
	   System.out.println("Hello User ! I will Execute Third ");
	}
	B(int b) {
		this();
		System.out.println("Hello User ! I will Execute Last ");
	}
}

class Demo {
	public static void main(String s[])
	{ 
	B b = new B(6);
	}
}
	
