public class CircleArea {
    public static void main(String[] args) {
    	double radius = 0;
    	radius = radiusRequest(radius);
    	double area = calculateArea(radius);
        System.out.println("The area of the circle is: " + area);
    }
    
    public static double radiusRequest(double radius) {
        Scanner input = new Scanner(System.in);
        return radius = input.nextDouble();
    }
    
    public static double calculateArea(double radius) {
    	double area = Math.PI * radius * radius;
    	return area;
    }    
}
