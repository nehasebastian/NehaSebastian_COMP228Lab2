package excercise3;

public class Driver {
    public static void main(String[] args) {
        //to display the area of the circle
        System.out.printf("The area of the circle is %2f\n" ,Area.getArea(20));
        //to display the area of rectangle
        System.out.printf("The area of the rectangle is %2f\n ",Area.getArea(20,40));
        //to display the area of cylinder
        System.out.printf("The area of the cylinder is %2f\n",Area.getArea(5,20));
    }
}
