
public class Question_5 {

	public static void main(String[] args) {
		Shape l=new Line();
		l.draw();
		Shape r=new Reactangle();
		r.draw();
		Shape c=new Cube();
		c.draw();
	}

}
abstract class Shape{
	abstract void draw();
}

class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Line is Drawn");
		
	}
  	
}
class Reactangle extends Shape{

	@Override
	void draw() {
		System.out.println("Rectangle is Drawn");
		
	}
	
}
class Cube extends Shape{

	@Override
	void draw() {
		System.out.println("Cube is Drawn");
		
	}
	
}