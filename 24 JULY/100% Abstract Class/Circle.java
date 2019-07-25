class Circle extends Shape{
	double ar;
	public void findArea(){
		double r=6.2;
		 ar=3.14*r*r;
	}
	public void printArea(){
		System.out.println("Area of Circle = "+ar);
	}
}