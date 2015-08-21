
public class TestBall {

	public static void main(String[] args) {
		Ball b1 = new Ball();
		System.out.println("X is " +b1.getX()+ " Y is " +b1.getY());
		
		
		Ball b2 = new Ball(5.0,3.0);
		System.out.println("X is " +b2.getX()+ " Y is " +b2.getY());
		
		b1.move(3.3, 5.9);
		b2.move(6.6, 50.1);
		
		System.out.println("Ball2 is" +b2);
		System.out.println("Ball1 is " +b1);
		
		

	}

}
