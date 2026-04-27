import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    float meter;
	    float feet;
		System.out.println("enter value of meter ");
		meter = sc.nextFloat();
		feet= (meter *3.28084f)/1.0f;
		System.out.println("feet="+feet);
	}
}



/*output
enter value of meter 
4
feet=13.12336*/