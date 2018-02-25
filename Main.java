import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float area;
		double radius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		if(sc.hasNextDouble()) {
			radius = sc.nextDouble();			
			area = (float) (Math.pow(radius, 2) * Math.PI);
			System.out.printf("The approximate area of the circle is: %.4f", area);
		}
		else {
			System.out.println("Invalid input entered.");
		}
		
		sc.close();
				
	}

}

