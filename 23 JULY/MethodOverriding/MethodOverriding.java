// This Program Also Shows Run Time Polymorphism
// Dynamic Binding

class A{
	public void show(){
		System.out.println("Hello A");
	}
	public void print(){
		System.out.println("Hi A");
	}
}
class B extends A{
	public void show(){
		System.out.println("Hello B");
	}
	public void display(){
		System.out.println("Hi B");
	}
}

class Demo{
	public static void main(String ar[])
	{
		 A a = new A();
		 a.show();
		 a.print();
		 //a.display();
		 a = new B();
		 a.show();
		 a.print();
		 //a.display();
		 B b = new B();
		 b.show();
		 b.print();
		 b.display();
	}
}
