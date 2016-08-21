import java.awt.Rectangle;
import java.util.Scanner;

class details{
	
	int l;
	int b;
	
	
	
	details(int x,int y){
		l=x;
		b=y;
				
	}
	
	int getrectangle(){
		return l*b;
	}

	float gettriangle(){
		return (float) (0.5*l*b);
	}
	
	
}

public class assignment1 extends details {

	assignment1(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details details = new details(20,10);
		
		
 System.out.print("the area of rectagle is "+ details.getrectangle());
 System.out.println("this are of triangle is " + details.gettriangle());
 
	}

}
