class Rectangle extends Shape{
	double ar;
	public void findArea(){
		double l=2.3 , b=6.5 ;
	    ar=l*b;
	}
	public void printArea(){
		System.out.println("Area of Rectangle = "+ar);
	}
}