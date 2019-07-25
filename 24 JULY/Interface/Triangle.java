class Triangle implements Shape{
	double ar;
	public void findArea(){
		double b=7.2 , h=9.5 ;
		 ar=(b*h)/2;
		
	}
	public void printArea(){
		System.out.println("Area of Triangle = "+ar);
	}
}