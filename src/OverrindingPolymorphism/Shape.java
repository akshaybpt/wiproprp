package OverrindingPolymorphism;

 class Shape {
	 
	public void draw(){
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
	
	public static void main(String [] agrs) {
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
	}
	
	

}
 class Circle extends Shape{
	public void draw(){
		 System.out.println("Drawing Circle");
	 }
		public void erase() {
			 System.out.println("Erasing Circle");
		}
	}
 class Triangle extends Shape{
		public void draw(){
			 System.out.println("Drawing Triangle");
		 }
			public void erase() {
				 System.out.println("Erasing Triangle");
			}
		}
 class Square extends Shape{
		public void draw(){
			 System.out.println("Drawing Square");
		 }
			public void erase() {
				 System.out.println("Erasing Square");
			}
		}
