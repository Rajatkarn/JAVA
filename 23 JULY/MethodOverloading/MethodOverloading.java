// This Program Also Shows Compile Time Polymorphism
// Static Binding

class Overload{
	void add(int a,int b)
	{
		System.out.println("Number Addition = "+(a+b));
	}
	void add(double a,double b)
	{
		System.out.println("Floating Point Addition = "+(a+b));
	}
	String add(String a,String b)
	{
		return(a+" "+b);
	}
}
class MethodOverloading{
	public static void main(String ar[]){
		Overload o = new Overload();
		o.add(5,7);
		o.add(12.0,4.5);
		String s = o.add("Hello","Rajat");
		System.out.println("String Addition = "+s);
	}
}
		
	