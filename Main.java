import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float area;
		float halfArea;
		float perimeter;
		double radius;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		
		if(sc.hasNextDouble()) {
			radius = sc.nextDouble();			
			area = (float) (Math.pow(radius, 2) * Math.PI);
			halfArea = area / 2;
			perimeter = (float) (2 * Math.PI * radius);
			System.out.printf("The approximate area of the circle is: %.3f \n", area);
			System.out.printf("The half area of the circle is: %.3f \n", halfArea);
			System.out.printf("The perimeter of the circle is: %.3f", perimeter);
		}
		else {
			System.out.println("Invalid input entered.");
		}
		
		sc.close();
				
	}

}

